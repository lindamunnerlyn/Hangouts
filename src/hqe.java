// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import java.io.IOException;

public final class hqe extends HttpResponseException
{

    private static final long serialVersionUID = 0x37cc5b6d7204050cL;
    final transient hpz a;

    private hqe(com.google.api.client.http.HttpResponseException.Builder builder, hpz hpz1)
    {
        super(builder);
        a = hpz1;
    }

    public static hqe a(JsonFactory jsonfactory, HttpResponse httpresponse)
    {
        Object obj;
        String s;
        com.google.api.client.http.HttpResponseException.Builder builder;
        obj = null;
        builder = new com.google.api.client.http.HttpResponseException.Builder(httpresponse.getStatusCode(), httpresponse.getStatusMessage(), httpresponse.getHeaders());
        h.a(jsonfactory);
        s = httpresponse.getContentType();
        if (httpresponse.isSuccessStatusCode() || s == null) goto _L2; else goto _L1
_L1:
        if (httpresponse.getContent() == null || !HttpMediaType.equalsIgnoreParameters("application/json; charset=UTF-8", s)) goto _L2; else goto _L3
_L3:
        jsonfactory = (hpz)(new JsonObjectParser(jsonfactory)).parseAndClose(httpresponse.getContent(), httpresponse.getContentCharset(), hpz);
        s = jsonfactory.toPrettyString();
        obj = jsonfactory;
        jsonfactory = s;
_L4:
        httpresponse = HttpResponseException.computeMessageBuffer(httpresponse);
        IOException ioexception;
        boolean flag;
        if (jsonfactory == null || jsonfactory.length() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            httpresponse.append(htc.a).append(jsonfactory);
            builder.setContent(jsonfactory);
        }
        builder.setMessage(httpresponse.toString());
        return new hqe(builder, ((hpz) (obj)));
_L2:
        jsonfactory = httpresponse.parseAsString();
          goto _L4
        ioexception;
        jsonfactory = null;
_L5:
        ioexception.printStackTrace();
        ioexception = jsonfactory;
        jsonfactory = null;
          goto _L4
        ioexception;
          goto _L5
    }
}
