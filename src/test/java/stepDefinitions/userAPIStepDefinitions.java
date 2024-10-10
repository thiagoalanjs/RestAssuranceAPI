package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import setup.setupSettings;
import static io.restassured.RestAssured.given;

public class userAPIStepDefinitions {

    public  Response response;
    public  Response responseGet;
    public RequestSpecification request;
    public int userId;


    @Given("que eu crio um novo usuário")
    public void criarNovoUsuario() {
        RestAssured.baseURI = setupSettings.apiURL();
        request = given().log().all().request();

        response = request.header(setupSettings.headerContentType(), setupSettings.headerApplication())
                .body(setupSettings.userRegister())
                .post("/users");

        // Validar a resposta e capturar o ID
        response.then().statusCode(200);
        userId = response.jsonPath().getInt("id");
        System.out.println("ID do usuário: " + userId);
        responseGet = given().log().all().request().get("/users/" + userId);
        System.out.println("Usuário obtido: " + response.body().asString());
    }

    @When("eu obtenho o usuário pelo ID")
    public void obterUsuarioPeloID() {
        responseGet = given().log().all().request().get("/users/" + userId);
        System.out.println("Usuário obtido: " + response.body().asString());
    }

    @Then("o status de resposta deve ser {int}")
    public void validarStatusResposta(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("o nome do usuário deve ser {string}")
    public void validarNomeUsuario(String nomeEsperado) {
        String nome = response.jsonPath().getString("name");
        System.out.println(nomeEsperado);
        System.out.println(nome);
        Assert.assertEquals(nomeEsperado, nome);
    }

    @When("eu atualizo o nome do usuário")
    public void atualizarNomeUsuario() {
        System.out.println(userId);

        response = given().log().all().request()
                .header(setupSettings.headerContentType(), setupSettings.headerApplication())
                .body(setupSettings.updateUser())
                .put("/users/" + userId);

        response.then().statusCode(200);
    }

    @Then("o nome atualizado deve ser {string}")
    public void validarNomeAtualizado(String nomeEsperado) {
        response = given().get("/users/" + userId);
        String nome = response.jsonPath().getString("name");
        System.out.println("Nome: " + nome);
        Assert.assertEquals(nomeEsperado, nome);
    }

    @When("eu deleto o usuário")
    public void deletarUsuario() {
        response = given().delete("/users/" + userId);
    }

    @Then("o status de deleção deve ser {int}")
    public void validarStatusDelecao(int statusCode) {
        response.then().statusCode(statusCode);
    }
}
