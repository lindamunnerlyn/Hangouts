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

final class gjd
    implements giv
{

    private final giz a;
    private final List b;
    private final String c;
    private final HttpTransport d;
    private final String e;
    private final gix f;

    gjd(giz giz1, String s, HttpTransport httptransport, String s1, gix gix1)
    {
        a = giz1;
        b = new ArrayList(a.c.size());
        c = s;
        d = httptransport;
        e = s1;
        f = gix1;
    }

    private boolean a(gjb gjb1, HttpRequestFactory httprequestfactory, hqk hqk1)
    {
        Object obj;
        try
        {
            obj = new URL(new URL(e), gjb1.b);
        }
        // Misplaced declaration of an exception variable
        catch (gjb gjb1)
        {
            gne.a(5, "vclib", "Error processing request url", gjb1);
            return false;
        }
        obj = new GenericUrl(((URL) (obj)));
        gjb1 = new giu(gjb1.c);
        try
        {
            gjb1 = httprequestfactory.buildPostRequest(((GenericUrl) (obj)), gjb1);
            gjb1.setParser(new gjf(this));
            hqk1.a(gjb1, gjc, gje, new hqj(b));
        }
        // Misplaced declaration of an exception variable
        catch (gjb gjb1)
        {
            gne.a(5, "vclib", "Error making apiary request", gjb1);
            return false;
        }
        return true;
    }

    private List c()
    {
        (new hqh()).c(c);
        Object obj1 = gir.a(c, null, a.b);
        Object obj = d.createRequestFactory(((com.google.api.client.http.HttpRequestInitializer) (obj1)));
        obj1 = new hqk(d, ((com.google.api.client.http.HttpRequestInitializer) (obj1)));
        for (Iterator iterator = a.c.iterator(); iterator.hasNext();)
        {
            if (!a((gjb)iterator.next(), ((HttpRequestFactory) (obj)), ((hqk) (obj1))))
            {
                return new ArrayList();
            }
        }

        try
        {
            ((hqk) (obj1)).a();
            obj = b;
        }
        catch (IOException ioexception)
        {
            gne.a(5, "vclib", "Error executing batch request ", ioexception);
            return new ArrayList();
        }
        return ((List) (obj));
    }

    public void a()
    {
        gjb gjb1;
        for (Iterator iterator = a.c.iterator(); iterator.hasNext(); f.a(gjb1.a, gjb1.b))
        {
            gjb1 = (gjb)iterator.next();
        }

    }

    public void a(Object obj)
    {
        int i = 0;
        if (b.isEmpty())
        {
            if (!a.c.isEmpty() && f != null)
            {
                gjb gjb1;
                for (obj = a.c.iterator(); ((Iterator) (obj)).hasNext(); f.a(gjb1.a))
                {
                    gjb1 = (gjb)((Iterator) (obj)).next();
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
            gdv.a("Expected condition to be true", flag);
            obj = a.c.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                gjb gjb2 = (gjb)((Iterator) (obj)).next();
                Object obj1 = b;
                int j = i + 1;
                obj1 = (gjc)((List) (obj1)).get(i);
                if (f != null)
                {
                    if (((gjc) (obj1)).a == null)
                    {
                        f.a(gjb2.a);
                        i = j;
                        continue;
                    }
                    f.a(gjb2.a, ((gjc) (obj1)).a);
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
