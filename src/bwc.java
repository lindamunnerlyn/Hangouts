// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.util.EntityUtils;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class bwc
    implements HttpUrlRequestListener
{

    private final ConditionVariable a = new ConditionVariable();
    private byte b[];
    private IOException c;

    bwc()
    {
    }

    static ConditionVariable a(bwc bwc1)
    {
        return bwc1.a;
    }

    static IOException b(bwc bwc1)
    {
        return bwc1.c;
    }

    static byte[] c(bwc bwc1)
    {
        return bwc1.b;
    }

    public void a(HttpUrlRequest httpurlrequest)
    {
    }

    public void b(HttpUrlRequest httpurlrequest)
    {
        int i;
        b = httpurlrequest.f();
        c = httpurlrequest.d();
        i = httpurlrequest.b();
        if (i == 200) goto _L2; else goto _L1
_L1:
        BasicHttpEntity basichttpentity;
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(b);
        basichttpentity = new BasicHttpEntity();
        basichttpentity.setContent(bytearrayinputstream);
        basichttpentity.setContentLength(httpurlrequest.a());
        basichttpentity.setContentType(httpurlrequest.l());
        String s = String.valueOf(EntityUtils.toString(basichttpentity));
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        s = "Http error response ".concat(s);
_L5:
        ebw.g("Babel_CronetHttpRequestSender", s);
_L2:
        if (c == null && i != 200)
        {
            c = new HttpResponseException(i, httpurlrequest.c());
        }
        a.open();
        return;
_L4:
        s = new String("Http error response ");
          goto _L5
        IOException ioexception;
        ioexception;
        String s1 = String.valueOf(Arrays.toString(b));
        if (s1.length() != 0)
        {
            s1 = "Http error but unable to parse the response body. Response Bytes: ".concat(s1);
        } else
        {
            s1 = new String("Http error but unable to parse the response body. Response Bytes: ");
        }
        ebw.e("Babel_CronetHttpRequestSender", s1, ioexception);
          goto _L2
    }
}
