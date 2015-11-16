// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

final class hlx extends AbstractHttpContent
{

    private final HttpRequest a;

    hlx(HttpRequest httprequest)
    {
        super("application/http");
        a = httprequest;
    }

    public void writeTo(OutputStream outputstream)
    {
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(outputstream, getCharset());
        outputstreamwriter.write(a.getRequestMethod());
        outputstreamwriter.write(" ");
        outputstreamwriter.write(a.getUrl().build());
        outputstreamwriter.write("\r\n");
        HttpHeaders httpheaders = new HttpHeaders();
        httpheaders.fromHttpHeaders(a.getHeaders());
        httpheaders.setAcceptEncoding(null).setUserAgent(null).setContentEncoding(null).setContentType(null).setContentLength(null);
        HttpContent httpcontent = a.getContent();
        if (httpcontent != null)
        {
            httpheaders.setContentType(httpcontent.getType());
            long l = httpcontent.getLength();
            if (l != -1L)
            {
                httpheaders.setContentLength(Long.valueOf(l));
            }
        }
        HttpHeaders.serializeHeadersForMultipartRequests(httpheaders, null, null, outputstreamwriter);
        outputstreamwriter.write("\r\n");
        outputstreamwriter.flush();
        if (httpcontent != null)
        {
            httpcontent.writeTo(outputstream);
        }
    }
}
