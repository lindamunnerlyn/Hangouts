// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

final class adk extends DefaultHttpClient
{

    final adi a;

    adk(adi adi1, ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        a = adi1;
        super(clientconnectionmanager, httpparams);
    }

    protected HttpContext createHttpContext()
    {
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        basichttpcontext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basichttpcontext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basichttpcontext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basichttpcontext;
    }

    protected BasicHttpProcessor createHttpProcessor()
    {
        BasicHttpProcessor basichttpprocessor = super.createHttpProcessor();
        basichttpprocessor.addRequestInterceptor(adi.b());
        basichttpprocessor.addRequestInterceptor(new adl(a));
        return basichttpprocessor;
    }
}
