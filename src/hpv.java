// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hpv
    implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler
{

    static final Logger a = Logger.getLogger(hpv.getName());
    public final hsa b;
    public final HttpTransport c;
    public final HttpExecuteInterceptor d;
    public final JsonFactory e;
    public final String f;
    private final Lock g = new ReentrantLock();
    private final hpw h;
    private String i;
    private Long j;
    private String k;
    private final Collection l;
    private final HttpRequestInitializer m;

    public hpv(hpx hpx1)
    {
        h = (hpw)h.a(hpx1.a);
        c = hpx1.b;
        e = hpx1.c;
        String s;
        if (hpx1.d == null)
        {
            s = null;
        } else
        {
            s = hpx1.d.build();
        }
        f = s;
        d = hpx1.f;
        m = hpx1.g;
        l = Collections.unmodifiableCollection(hpx1.h);
        b = (hsa)h.a(hpx1.e);
    }

    private Long b()
    {
        g.lock();
        Long long1 = j;
        if (long1 == null)
        {
            g.unlock();
            return null;
        }
        long l1 = (j.longValue() - b.a()) / 1000L;
        g.unlock();
        return Long.valueOf(l1);
        Exception exception;
        exception;
        g.unlock();
        throw exception;
    }

    private boolean c()
    {
        boolean flag;
        flag = true;
        g.lock();
        hqd hqd1 = a();
        if (hqd1 == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        a(hqd1);
        for (Iterator iterator = l.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_140;
        Object obj;
        obj;
        Iterator iterator1;
        if (400 > ((hqe) (obj)).getStatusCode() || ((hqe) (obj)).getStatusCode() >= 500)
        {
            flag = false;
        }
        if (((hqe) (obj)).a == null || !flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        a(((String) (null)));
        b(((Long) (null)));
        for (iterator1 = l.iterator(); iterator1.hasNext(); iterator1.next()) { }
        break MISSING_BLOCK_LABEL_156;
        obj;
        g.unlock();
        throw obj;
        g.unlock();
        return true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        throw obj;
        g.unlock();
        return false;
    }

    public hpv a(hqd hqd1)
    {
        a(hqd1.a);
        if (hqd1.c != null)
        {
            b(hqd1.c);
        }
        b(hqd1.b);
        return this;
    }

    public hpv a(Long long1)
    {
        g.lock();
        j = long1;
        g.unlock();
        return this;
        long1;
        g.unlock();
        throw long1;
    }

    public hpv a(String s)
    {
        g.lock();
        i = s;
        g.unlock();
        return this;
        s;
        g.unlock();
        throw s;
    }

    public hqd a()
    {
        if (k == null)
        {
            return null;
        } else
        {
            return (new hpy(c, e, new GenericUrl(f), k)).a(d).a(m).a();
        }
    }

    public hpv b(Long long1)
    {
        if (long1 == null)
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(b.a() + long1.longValue() * 1000L);
        }
        return a(long1);
    }

    public hpv b(String s)
    {
        g.lock();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        boolean flag;
        if (e != null && c != null && d != null && f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
        k = s;
        g.unlock();
        return this;
        s;
        g.unlock();
        throw s;
    }

    public boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
    {
        Object obj;
        boolean flag2;
        flag2 = true;
        obj = httpresponse.getHeaders().getAuthenticateAsList();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        String s1 = (String)((Iterator) (obj)).next();
        if (!s1.startsWith("Bearer ")) goto _L5; else goto _L4
_L4:
        boolean flag1;
        flag = hpu.a.matcher(s1).find();
        flag1 = true;
_L8:
        if (!flag1)
        {
            if (httpresponse.getStatusCode() == 401)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        g.lock();
        httpresponse = i;
        httprequest = httprequest.getHeaders().getAuthorizationAsList();
        if (httprequest == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        httprequest = httprequest.iterator();
        String s;
        do
        {
            if (!httprequest.hasNext())
            {
                break MISSING_BLOCK_LABEL_240;
            }
            s = (String)httprequest.next();
        } while (!s.startsWith("Bearer "));
        httprequest = s.substring(7);
_L9:
        flag = flag2;
        if (!l.a(httpresponse, httprequest))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        flag = c();
        if (flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        g.unlock();
        return flag;
        httprequest;
        try
        {
            g.unlock();
            throw httprequest;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            a.log(Level.SEVERE, "unable to refresh token", httprequest);
        }
_L7:
        return false;
_L2:
        flag1 = false;
        flag = false;
          goto _L8
        httprequest = null;
          goto _L9
    }

    public void initialize(HttpRequest httprequest)
    {
        httprequest.setInterceptor(this);
        httprequest.setUnsuccessfulResponseHandler(this);
    }

    public void intercept(HttpRequest httprequest)
    {
        g.lock();
        Object obj;
        obj = b();
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (((Long) (obj)).longValue() > 60L)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        c();
        obj = i;
        if (obj == null)
        {
            g.unlock();
            return;
        }
        String s = i;
        obj = httprequest.getHeaders();
        httprequest = String.valueOf("Bearer ");
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        httprequest = httprequest.concat(s);
_L1:
        ((HttpHeaders) (obj)).setAuthorization(httprequest);
        g.unlock();
        return;
        httprequest = new String(httprequest);
          goto _L1
        httprequest;
        g.unlock();
        throw httprequest;
    }

}
