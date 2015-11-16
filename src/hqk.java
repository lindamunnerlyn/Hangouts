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

public final class hqk
{

    List a;
    private GenericUrl b;
    private final HttpRequestFactory c;
    private hsz d;

    public hqk(HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        b = new GenericUrl("https://www.googleapis.com/batch");
        a = new ArrayList();
        d = hsz.a;
        if (httprequestinitializer == null)
        {
            httptransport = httptransport.createRequestFactory();
        } else
        {
            httptransport = httptransport.createRequestFactory(httprequestinitializer);
        }
        c = httptransport;
    }

    public hqk a(HttpRequest httprequest, Class class1, Class class2, hqj hqj)
    {
        h.a(httprequest);
        h.a(hqj);
        h.a(class1);
        h.a(class2);
        a.add(new hqm(hqj, class1, class2, httprequest));
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
        hqm hqm1;
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
        httprequest.setInterceptor(new hql(this, httprequest.getInterceptor()));
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
            hqm1 = (hqm)iterator.next();
            ((MultipartContent) (obj)).addPart(new com.google.api.client.http.MultipartContent.Part((new HttpHeaders()).setAcceptEncoding(null).set("Content-ID", Integer.valueOf(j)), new hqs(hqm1.d)));
        }

        httprequest.setContent(((com.google.api.client.http.HttpContent) (obj)));
        obj1 = httprequest.execute();
        obj = String.valueOf(((HttpResponse) (obj1)).getMediaType().getParameter("boundary"));
        if (((String) (obj)).length() == 0) goto _L2; else goto _L1
_L1:
        obj = "--".concat(((String) (obj)));
_L4:
        for (obj = new hqn(((HttpResponse) (obj1)).getContent(), ((String) (obj)), a, flag); ((hqn) (obj)).a;)
        {
            ((hqn) (obj)).a();
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
        obj1 = ((hqn) (obj)).b;
        if (((List) (obj1)).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        a = ((List) (obj1));
        if (((hqn) (obj)).c && backoffpolicy != null)
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
