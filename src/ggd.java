// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ggd
    implements gfv
{

    private final gfz a;
    private final List b;
    private final String c;
    private final HttpTransport d;
    private final String e;
    private final gfx f;

    ggd(gfz gfz1, String s, HttpTransport httptransport, String s1, gfx gfx1)
    {
        a = gfz1;
        b = new ArrayList(a.c.size());
        c = s;
        d = httptransport;
        e = s1;
        f = gfx1;
    }

    private boolean a(ggb ggb1, HttpRequestFactory httprequestfactory, hlp hlp1)
    {
        Object obj;
        try
        {
            obj = new URL(new URL(e), ggb1.b);
        }
        // Misplaced declaration of an exception variable
        catch (ggb ggb1)
        {
            gkc.a("vclib", "Error processing request url", ggb1);
            return false;
        }
        obj = new GenericUrl(((URL) (obj)));
        ggb1 = new gfu(ggb1.c);
        try
        {
            ggb1 = httprequestfactory.buildPostRequest(((GenericUrl) (obj)), ggb1);
            ggb1.setParser(new ggf(this));
            hlp1.a(ggb1, ggc, gge, new hlo(b));
        }
        // Misplaced declaration of an exception variable
        catch (ggb ggb1)
        {
            gkc.a("vclib", "Error making apiary request", ggb1);
            return false;
        }
        return true;
    }

    private List c()
    {
        (new hlm()).c(c);
        Object obj1 = gfr.a(c, null, a.b);
        Object obj = d.createRequestFactory(((com.google.api.client.http.HttpRequestInitializer) (obj1)));
        obj1 = new hlp(d, ((com.google.api.client.http.HttpRequestInitializer) (obj1)));
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            if (!a((ggb)iterator.next(), ((HttpRequestFactory) (obj)), ((hlp) (obj1))))
            {
                return new ArrayList();
            }
        }

        try
        {
            ((hlp) (obj1)).a();
            obj = b;
        }
        catch (IOException ioexception)
        {
            gkc.a("vclib", "Error executing batch request ", ioexception);
            return new ArrayList();
        }
        return ((List) (obj));
    }

    public void a()
    {
        ggb ggb1;
        for (Iterator iterator = a.c.iterator(); iterator.hasNext(); f.a(ggb1.a, ggb1.b))
        {
            ggb1 = (ggb)iterator.next();
        }

    }

    public void a(Object obj)
    {
        int i = 0;
        if (b.isEmpty())
        {
            if (!a.c.isEmpty() && f != null)
            {
                ggb ggb1;
                for (obj = a.c.iterator(); ((Iterator) (obj)).hasNext(); f.a(ggb1.a))
                {
                    ggb1 = (ggb)((Iterator) (obj)).next();
                }

            }
        } else
        {
            boolean flag;
            if (a.c.size() == b.size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            obj = a.c.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ggb ggb2 = (ggb)((Iterator) (obj)).next();
                Object obj1 = b;
                int j = i + 1;
                obj1 = (ggc)((List) (obj1)).get(i);
                if (f != null)
                {
                    if (((ggc) (obj1)).a == null)
                    {
                        f.a(ggb2.a);
                        i = j;
                        continue;
                    }
                    f.a(ggb2.a, ((ggc) (obj1)).a);
                }
                i = j;
            } while (true);
        }
    }

    public Object b()
    {
        return c();
    }
}
