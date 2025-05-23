package specialwords;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.http.exceptions.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import specialwords.implementation.ParametersImpl;

/**
 * Initializes a new instance of the synchronous SpecialWordsClient type.
 */
@ServiceClient(builder = SpecialWordsClientBuilder.class)
public final class ParametersClient {
    @Metadata(generated = true)
    private final ParametersImpl serviceClient;

    /**
     * Initializes an instance of ParametersClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    ParametersClient(ParametersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The withAnd operation.
     * 
     * @param and The and parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withAndWithResponse(String and, RequestOptions requestOptions) {
        return this.serviceClient.withAndWithResponse(and, requestOptions);
    }

    /**
     * The withAs operation.
     * 
     * @param as The as parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withAsWithResponse(String as, RequestOptions requestOptions) {
        return this.serviceClient.withAsWithResponse(as, requestOptions);
    }

    /**
     * The withAssert operation.
     * 
     * @param assertParameter The assertParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withAssertWithResponse(String assertParameter, RequestOptions requestOptions) {
        return this.serviceClient.withAssertWithResponse(assertParameter, requestOptions);
    }

    /**
     * The withAsync operation.
     * 
     * @param async The async parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withAsyncWithResponse(String async, RequestOptions requestOptions) {
        return this.serviceClient.withAsyncWithResponse(async, requestOptions);
    }

    /**
     * The withAwait operation.
     * 
     * @param await The await parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withAwaitWithResponse(String await, RequestOptions requestOptions) {
        return this.serviceClient.withAwaitWithResponse(await, requestOptions);
    }

    /**
     * The withBreak operation.
     * 
     * @param breakParameter The breakParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withBreakWithResponse(String breakParameter, RequestOptions requestOptions) {
        return this.serviceClient.withBreakWithResponse(breakParameter, requestOptions);
    }

    /**
     * The withClass operation.
     * 
     * @param classParameter The classParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withClassWithResponse(String classParameter, RequestOptions requestOptions) {
        return this.serviceClient.withClassWithResponse(classParameter, requestOptions);
    }

    /**
     * The withConstructor operation.
     * 
     * @param constructor The constructor parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withConstructorWithResponse(String constructor, RequestOptions requestOptions) {
        return this.serviceClient.withConstructorWithResponse(constructor, requestOptions);
    }

    /**
     * The withContinue operation.
     * 
     * @param continueParameter The continueParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withContinueWithResponse(String continueParameter, RequestOptions requestOptions) {
        return this.serviceClient.withContinueWithResponse(continueParameter, requestOptions);
    }

    /**
     * The withDef operation.
     * 
     * @param def The def parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withDefWithResponse(String def, RequestOptions requestOptions) {
        return this.serviceClient.withDefWithResponse(def, requestOptions);
    }

    /**
     * The withDel operation.
     * 
     * @param del The del parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withDelWithResponse(String del, RequestOptions requestOptions) {
        return this.serviceClient.withDelWithResponse(del, requestOptions);
    }

    /**
     * The withElif operation.
     * 
     * @param elif The elif parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withElifWithResponse(String elif, RequestOptions requestOptions) {
        return this.serviceClient.withElifWithResponse(elif, requestOptions);
    }

    /**
     * The withElse operation.
     * 
     * @param elseParameter The elseParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withElseWithResponse(String elseParameter, RequestOptions requestOptions) {
        return this.serviceClient.withElseWithResponse(elseParameter, requestOptions);
    }

    /**
     * The withExcept operation.
     * 
     * @param except The except parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withExceptWithResponse(String except, RequestOptions requestOptions) {
        return this.serviceClient.withExceptWithResponse(except, requestOptions);
    }

    /**
     * The withExec operation.
     * 
     * @param exec The exec parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withExecWithResponse(String exec, RequestOptions requestOptions) {
        return this.serviceClient.withExecWithResponse(exec, requestOptions);
    }

    /**
     * The withFinally operation.
     * 
     * @param finallyParameter The finallyParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withFinallyWithResponse(String finallyParameter, RequestOptions requestOptions) {
        return this.serviceClient.withFinallyWithResponse(finallyParameter, requestOptions);
    }

    /**
     * The withFor operation.
     * 
     * @param forParameter The forParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withForWithResponse(String forParameter, RequestOptions requestOptions) {
        return this.serviceClient.withForWithResponse(forParameter, requestOptions);
    }

    /**
     * The withFrom operation.
     * 
     * @param from The from parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withFromWithResponse(String from, RequestOptions requestOptions) {
        return this.serviceClient.withFromWithResponse(from, requestOptions);
    }

    /**
     * The withGlobal operation.
     * 
     * @param global The global parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withGlobalWithResponse(String global, RequestOptions requestOptions) {
        return this.serviceClient.withGlobalWithResponse(global, requestOptions);
    }

    /**
     * The withIf operation.
     * 
     * @param ifParameter The ifParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withIfWithResponse(String ifParameter, RequestOptions requestOptions) {
        return this.serviceClient.withIfWithResponse(ifParameter, requestOptions);
    }

    /**
     * The withImport operation.
     * 
     * @param importParameter The importParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withImportWithResponse(String importParameter, RequestOptions requestOptions) {
        return this.serviceClient.withImportWithResponse(importParameter, requestOptions);
    }

    /**
     * The withIn operation.
     * 
     * @param in The in parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withInWithResponse(String in, RequestOptions requestOptions) {
        return this.serviceClient.withInWithResponse(in, requestOptions);
    }

    /**
     * The withIs operation.
     * 
     * @param is The is parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withIsWithResponse(String is, RequestOptions requestOptions) {
        return this.serviceClient.withIsWithResponse(is, requestOptions);
    }

    /**
     * The withLambda operation.
     * 
     * @param lambda The lambda parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withLambdaWithResponse(String lambda, RequestOptions requestOptions) {
        return this.serviceClient.withLambdaWithResponse(lambda, requestOptions);
    }

    /**
     * The withNot operation.
     * 
     * @param not The not parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withNotWithResponse(String not, RequestOptions requestOptions) {
        return this.serviceClient.withNotWithResponse(not, requestOptions);
    }

    /**
     * The withOr operation.
     * 
     * @param or The or parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withOrWithResponse(String or, RequestOptions requestOptions) {
        return this.serviceClient.withOrWithResponse(or, requestOptions);
    }

    /**
     * The withPass operation.
     * 
     * @param pass The pass parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withPassWithResponse(String pass, RequestOptions requestOptions) {
        return this.serviceClient.withPassWithResponse(pass, requestOptions);
    }

    /**
     * The withRaise operation.
     * 
     * @param raise The raise parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withRaiseWithResponse(String raise, RequestOptions requestOptions) {
        return this.serviceClient.withRaiseWithResponse(raise, requestOptions);
    }

    /**
     * The withReturn operation.
     * 
     * @param returnParameter The returnParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withReturnWithResponse(String returnParameter, RequestOptions requestOptions) {
        return this.serviceClient.withReturnWithResponse(returnParameter, requestOptions);
    }

    /**
     * The withTry operation.
     * 
     * @param tryParameter The tryParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withTryWithResponse(String tryParameter, RequestOptions requestOptions) {
        return this.serviceClient.withTryWithResponse(tryParameter, requestOptions);
    }

    /**
     * The withWhile operation.
     * 
     * @param whileParameter The whileParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withWhileWithResponse(String whileParameter, RequestOptions requestOptions) {
        return this.serviceClient.withWhileWithResponse(whileParameter, requestOptions);
    }

    /**
     * The withWith operation.
     * 
     * @param with The with parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withWithWithResponse(String with, RequestOptions requestOptions) {
        return this.serviceClient.withWithWithResponse(with, requestOptions);
    }

    /**
     * The withYield operation.
     * 
     * @param yield The yield parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withYieldWithResponse(String yield, RequestOptions requestOptions) {
        return this.serviceClient.withYieldWithResponse(yield, requestOptions);
    }

    /**
     * The withCancellationToken operation.
     * 
     * @param cancellationToken The cancellationToken parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withCancellationTokenWithResponse(String cancellationToken, RequestOptions requestOptions) {
        return this.serviceClient.withCancellationTokenWithResponse(cancellationToken, requestOptions);
    }

    /**
     * The withAnd operation.
     * 
     * @param and The and parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withAnd(String and) {
        // Generated convenience method for withAndWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withAndWithResponse(and, requestOptions).getValue();
    }

    /**
     * The withAs operation.
     * 
     * @param as The as parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withAs(String as) {
        // Generated convenience method for withAsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withAsWithResponse(as, requestOptions).getValue();
    }

    /**
     * The withAssert operation.
     * 
     * @param assertParameter The assertParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withAssert(String assertParameter) {
        // Generated convenience method for withAssertWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withAssertWithResponse(assertParameter, requestOptions).getValue();
    }

    /**
     * The withAsync operation.
     * 
     * @param async The async parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withAsync(String async) {
        // Generated convenience method for withAsyncWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withAsyncWithResponse(async, requestOptions).getValue();
    }

    /**
     * The withAwait operation.
     * 
     * @param await The await parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withAwait(String await) {
        // Generated convenience method for withAwaitWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withAwaitWithResponse(await, requestOptions).getValue();
    }

    /**
     * The withBreak operation.
     * 
     * @param breakParameter The breakParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withBreak(String breakParameter) {
        // Generated convenience method for withBreakWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withBreakWithResponse(breakParameter, requestOptions).getValue();
    }

    /**
     * The withClass operation.
     * 
     * @param classParameter The classParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withClass(String classParameter) {
        // Generated convenience method for withClassWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withClassWithResponse(classParameter, requestOptions).getValue();
    }

    /**
     * The withConstructor operation.
     * 
     * @param constructor The constructor parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withConstructor(String constructor) {
        // Generated convenience method for withConstructorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withConstructorWithResponse(constructor, requestOptions).getValue();
    }

    /**
     * The withContinue operation.
     * 
     * @param continueParameter The continueParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withContinue(String continueParameter) {
        // Generated convenience method for withContinueWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withContinueWithResponse(continueParameter, requestOptions).getValue();
    }

    /**
     * The withDef operation.
     * 
     * @param def The def parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withDef(String def) {
        // Generated convenience method for withDefWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withDefWithResponse(def, requestOptions).getValue();
    }

    /**
     * The withDel operation.
     * 
     * @param del The del parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withDel(String del) {
        // Generated convenience method for withDelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withDelWithResponse(del, requestOptions).getValue();
    }

    /**
     * The withElif operation.
     * 
     * @param elif The elif parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withElif(String elif) {
        // Generated convenience method for withElifWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withElifWithResponse(elif, requestOptions).getValue();
    }

    /**
     * The withElse operation.
     * 
     * @param elseParameter The elseParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withElse(String elseParameter) {
        // Generated convenience method for withElseWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withElseWithResponse(elseParameter, requestOptions).getValue();
    }

    /**
     * The withExcept operation.
     * 
     * @param except The except parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withExcept(String except) {
        // Generated convenience method for withExceptWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withExceptWithResponse(except, requestOptions).getValue();
    }

    /**
     * The withExec operation.
     * 
     * @param exec The exec parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withExec(String exec) {
        // Generated convenience method for withExecWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withExecWithResponse(exec, requestOptions).getValue();
    }

    /**
     * The withFinally operation.
     * 
     * @param finallyParameter The finallyParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withFinally(String finallyParameter) {
        // Generated convenience method for withFinallyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withFinallyWithResponse(finallyParameter, requestOptions).getValue();
    }

    /**
     * The withFor operation.
     * 
     * @param forParameter The forParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withFor(String forParameter) {
        // Generated convenience method for withForWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withForWithResponse(forParameter, requestOptions).getValue();
    }

    /**
     * The withFrom operation.
     * 
     * @param from The from parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withFrom(String from) {
        // Generated convenience method for withFromWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withFromWithResponse(from, requestOptions).getValue();
    }

    /**
     * The withGlobal operation.
     * 
     * @param global The global parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withGlobal(String global) {
        // Generated convenience method for withGlobalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withGlobalWithResponse(global, requestOptions).getValue();
    }

    /**
     * The withIf operation.
     * 
     * @param ifParameter The ifParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withIf(String ifParameter) {
        // Generated convenience method for withIfWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withIfWithResponse(ifParameter, requestOptions).getValue();
    }

    /**
     * The withImport operation.
     * 
     * @param importParameter The importParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withImport(String importParameter) {
        // Generated convenience method for withImportWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withImportWithResponse(importParameter, requestOptions).getValue();
    }

    /**
     * The withIn operation.
     * 
     * @param in The in parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withIn(String in) {
        // Generated convenience method for withInWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withInWithResponse(in, requestOptions).getValue();
    }

    /**
     * The withIs operation.
     * 
     * @param is The is parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withIs(String is) {
        // Generated convenience method for withIsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withIsWithResponse(is, requestOptions).getValue();
    }

    /**
     * The withLambda operation.
     * 
     * @param lambda The lambda parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withLambda(String lambda) {
        // Generated convenience method for withLambdaWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withLambdaWithResponse(lambda, requestOptions).getValue();
    }

    /**
     * The withNot operation.
     * 
     * @param not The not parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withNot(String not) {
        // Generated convenience method for withNotWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withNotWithResponse(not, requestOptions).getValue();
    }

    /**
     * The withOr operation.
     * 
     * @param or The or parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withOr(String or) {
        // Generated convenience method for withOrWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withOrWithResponse(or, requestOptions).getValue();
    }

    /**
     * The withPass operation.
     * 
     * @param pass The pass parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withPass(String pass) {
        // Generated convenience method for withPassWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withPassWithResponse(pass, requestOptions).getValue();
    }

    /**
     * The withRaise operation.
     * 
     * @param raise The raise parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withRaise(String raise) {
        // Generated convenience method for withRaiseWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withRaiseWithResponse(raise, requestOptions).getValue();
    }

    /**
     * The withReturn operation.
     * 
     * @param returnParameter The returnParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withReturn(String returnParameter) {
        // Generated convenience method for withReturnWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withReturnWithResponse(returnParameter, requestOptions).getValue();
    }

    /**
     * The withTry operation.
     * 
     * @param tryParameter The tryParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withTry(String tryParameter) {
        // Generated convenience method for withTryWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withTryWithResponse(tryParameter, requestOptions).getValue();
    }

    /**
     * The withWhile operation.
     * 
     * @param whileParameter The whileParameter parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withWhile(String whileParameter) {
        // Generated convenience method for withWhileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withWhileWithResponse(whileParameter, requestOptions).getValue();
    }

    /**
     * The withWith operation.
     * 
     * @param with The with parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withWith(String with) {
        // Generated convenience method for withWithWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withWithWithResponse(with, requestOptions).getValue();
    }

    /**
     * The withYield operation.
     * 
     * @param yield The yield parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withYield(String yield) {
        // Generated convenience method for withYieldWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withYieldWithResponse(yield, requestOptions).getValue();
    }

    /**
     * The withCancellationToken operation.
     * 
     * @param cancellationToken The cancellationToken parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void withCancellationToken(String cancellationToken) {
        // Generated convenience method for withCancellationTokenWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withCancellationTokenWithResponse(cancellationToken, requestOptions).getValue();
    }
}
