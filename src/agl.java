// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public final class agl
    implements afq
{

    public static final boolean a;
    private static int d = 3000;
    private static int e = 4096;
    public final agq b;
    public final agm c;

    public agl(agq agq1)
    {
        this(agq1, new agm(e));
    }

    private agl(agq agq1, agm agm1)
    {
        b = agq1;
        c = agm1;
    }

    private static Map a(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private static void a(String s, afw afw1, agh agh1)
    {
        age age1 = afw1.m();
        int i = afw1.d.a();
        try
        {
            age1.a(agh1);
        }
        // Misplaced declaration of an exception variable
        catch (agh agh1)
        {
            afw1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw agh1;
        }
        afw1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        agr agr1;
        agr1 = new agr(c, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new agf();
        exception;
        byte abyte0[];
        byte abyte1[];
        int i;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            agi.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        agr1.close();
        throw exception;
        obj = exception;
        abyte0 = c.a(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        agr1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = agr1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            agi.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        agr1.close();
        return abyte1;
    }

    public aft a(afw afw1)
    {
        long l = SystemClock.elapsedRealtime();
_L7:
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = Collections.emptyMap();
        Object obj;
        Object obj1;
        obj = new HashMap();
        obj1 = afw1.e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (((afl) (obj1)).b != null)
        {
            ((Map) (obj)).put("If-None-Match", ((afl) (obj1)).b);
        }
        if (((afl) (obj1)).d > 0L)
        {
            ((Map) (obj)).put("If-Modified-Since", DateUtils.formatDate(new Date(((afl) (obj1)).d)));
        }
        obj1 = b.a(afw1, ((Map) (obj)));
        obj = obj2;
        Object obj3 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj2;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        obj4 = a(((HttpResponse) (obj1)).getAllHeaders());
        if (i != 304)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj = obj4;
        obj2 = afw1.e();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        obj = obj4;
        return new aft(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        ((afl) (obj2)).g.putAll(((Map) (obj4)));
        obj = obj4;
        return new aft(304, ((afl) (obj2)).a, ((afl) (obj2)).g, true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = a(((HttpResponse) (obj1)).getEntity());
        obj = obj2;
_L8:
        long l1 = SystemClock.elapsedRealtime() - l;
        if (!a && l1 <= (long)d) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj2 = Integer.valueOf(obj.length);
_L9:
        agi.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            afw1, Long.valueOf(l1), obj2, Integer.valueOf(((StatusLine) (obj3)).getStatusCode()), Integer.valueOf(afw1.m().b())
        });
          goto _L4
_L11:
        throw new IOException();
        obj;
        a("socket", afw1, ((agh) (new agg())));
          goto _L7
_L2:
        obj = obj4;
        obj2 = new byte[0];
        obj = obj2;
          goto _L8
_L6:
        obj2 = "null";
          goto _L9
_L12:
        obj2 = new aft(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l);
        return ((aft) (obj2));
        obj;
        a("connection", afw1, ((agh) (new agg())));
          goto _L7
        obj;
        throw new RuntimeException((new StringBuilder("Bad URL ")).append(afw1.c()).toString(), ((Throwable) (obj)));
        obj1;
        obj3 = null;
        obj = obj2;
        obj2 = obj4;
_L10:
        if (obj2 != null)
        {
            i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            agi.c("Unexpected response code %d for %s", new Object[] {
                Integer.valueOf(i), afw1.c()
            });
            if (obj3 != null)
            {
                obj = new aft(i, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l);
                if (i == 401 || i == 403)
                {
                    a("auth", afw1, ((agh) (new afj(((aft) (obj))))));
                } else
                {
                    throw new agf(((aft) (obj)));
                }
            } else
            {
                throw new afs((byte)0);
            }
        } else
        {
            throw new afu(((Throwable) (obj1)));
        }
          goto _L7
        obj4;
        obj3 = null;
        obj2 = obj1;
        obj1 = obj4;
          goto _L10
        IOException ioexception;
        ioexception;
        obj2 = obj1;
        obj1 = ioexception;
        ioexception = ((IOException) (obj));
        obj = obj4;
          goto _L10
_L4:
        if (i >= 200 && i <= 299) goto _L12; else goto _L11
    }

    static 
    {
        a = agi.b;
    }
}
