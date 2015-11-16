// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.BackOffPolicy;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.MultipartContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hlp
{

    List a;
    private GenericUrl b;
    private final HttpRequestFactory c;
    private hod d;

    public hlp(HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        b = new GenericUrl("https://www.googleapis.com/batch");
        a = new ArrayList();
        d = hod.a;
        if (httprequestinitializer == null)
        {
            httptransport = httptransport.createRequestFactory();
        } else
        {
            httptransport = httptransport.createRequestFactory(httprequestinitializer);
        }
        c = httptransport;
    }

    public hlp a(HttpRequest httprequest, Class class1, Class class2, hlo hlo)
    {
        h.b(httprequest);
        h.b(hlo);
        h.b(class1);
        h.b(class2);
        a.add(new hlr(hlo, class1, class2, httprequest));
        return this;
    }

    public void a()
    {
        Object obj;
        HttpRequest httprequest;
        BackOffPolicy backoffpolicy;
        int i;
        boolean flag;
        Iterator iterator;
        hlr hlr1;
        int j;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.b(flag);
        httprequest = c.buildPostRequest(b, null);
        httprequest.setInterceptor(new hlq(this, httprequest.getInterceptor()));
        j = httprequest.getNumberOfRetries();
        backoffpolicy = httprequest.getBackOffPolicy();
        i = j;
        if (backoffpolicy != null)
        {
            backoffpolicy.reset();
            i = j;
        }
_L6:
        Object obj1;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new MultipartContent();
        ((MultipartContent) (obj)).getMediaType().setSubType("mixed");
        iterator = a.iterator();
        for (j = 1; iterator.hasNext(); j++)
        {
            hlr1 = (hlr)iterator.next();
            ((MultipartContent) (obj)).addPart(new com.google.api.client.http.MultipartContent.Part((new HttpHeaders()).setAcceptEncoding(null).set("Content-ID", Integer.valueOf(j)), new hlx(hlr1.d)));
        }

        httprequest.setContent(((com.google.api.client.http.HttpContent) (obj)));
        obj1 = httprequest.execute();
        obj = String.valueOf(((HttpResponse) (obj1)).getMediaType().getParameter("boundary"));
        if (((String) (obj)).length() == 0) goto _L2; else goto _L1
_L1:
        obj = "--".concat(((String) (obj)));
_L4:
        for (obj = new hls(((HttpResponse) (obj1)).getContent(), ((String) (obj)), a, flag); ((hls) (obj)).a;)
        {
            ((hls) (obj)).a();
        }

        break MISSING_BLOCK_LABEL_302;
        obj;
        ((HttpResponse) (obj1)).disconnect();
        throw obj;
_L2:
        obj = new String("--");
        if (true) goto _L4; else goto _L3
_L3:
        ((HttpResponse) (obj1)).disconnect();
        obj1 = ((hls) (obj)).b;
        if (((List) (obj1)).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        a = ((List) (obj1));
        if (((hls) (obj)).c && backoffpolicy != null)
        {
            long l1 = backoffpolicy.getNextBackOffMillis();
            if (l1 != -1L)
            {
                try
                {
                    d.a(l1);
                }
                catch (InterruptedException interruptedexception) { }
            }
        }
        i--;
        if (flag) goto _L6; else goto _L5
_L5:
        a.clear();
        return;
    }
}
