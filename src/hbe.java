// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class hbe
{

    private final String a;
    private final Context b;
    private final gzw c;
    private final String d;
    private final jvz e;
    private final ksv f;
    private final hut g;
    private long h;
    private String i;
    private boolean j;
    private long k;
    private Uri l;
    private Uri m;
    private gzw n;

    hbe(Context context, Uri uri, String s, String s1, jvz jvz, ksv ksv, hut hut)
    {
        b = context;
        l = uri;
        m = uri;
        d = s;
        e = jvz;
        f = ksv;
        g = hut;
        if (s1 == null)
        {
            s1 = g.a(context, uri);
        }
        a = s1;
        context = a(m);
        c = context;
        n = c;
        k = context.b();
        if (k <= 0L)
        {
            context = String.valueOf(m);
            throw new haf((new StringBuilder(String.valueOf(context).length() + 17)).append("Empty content at ").append(context).toString());
        }
        s = null;
        int i1;
        if (hko.b(uri))
        {
            context = a(uri, a);
            s = ((hbf) (context)).a;
            h = ((hbf) (context)).b;
        } else
        {
            h = System.currentTimeMillis();
        }
        context = s;
        if (s == null)
        {
            context = uri.toString();
        }
        i1 = context.lastIndexOf('/');
        uri = context;
        if (i1 != -1)
        {
            uri = context.substring(i1 + 1);
        }
        i = uri;
    }

    private gzw a(Uri uri)
    {
        ContentResolver contentresolver = b.getContentResolver();
        try
        {
            uri = gzw.a(contentresolver.openInputStream(uri));
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    private hbf a(Uri uri, String s)
    {
_L1:
        s = b.getContentResolver().query(uri, new String[] {
            "datetaken", "_data"
        }, null, null, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        uri = new hbf(s.getString(s.getColumnIndexOrThrow("_data")), s.getLong(s.getColumnIndexOrThrow("datetaken")));
        if (s != null)
        {
            s.close();
        }
        return uri;
        if (!hko.b(s) && !hko.c(s)) goto _L2; else goto _L1
_L2:
        uri = String.valueOf(uri);
        throw new hae((new StringBuilder(String.valueOf(uri).length() + 20)).append("Invalid content at: ").append(uri).toString(), true);
        uri = String.valueOf(uri);
        throw new haf((new StringBuilder(String.valueOf(uri).length() + 20)).append("No content for URI: ").append(uri).toString());
        uri;
_L4:
        if (s != null)
        {
            s.close();
        }
        throw uri;
        uri;
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public InputStream a(long l1)
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(b.getContentResolver().openInputStream(m));
        if (0L > 0L)
        {
            bufferedinputstream.skip(0L);
        }
        return bufferedinputstream;
    }

    public void a()
    {
        Object obj = g.c(b, m);
        if (obj != null)
        {
            m = ((Uri) (obj));
            obj = a(m);
            n = ((gzw) (obj));
            k = ((gzw) (obj)).b();
            j = true;
        }
    }

    public void a(String s)
    {
        i = s;
    }

    public void b(long l1)
    {
        h = l1;
    }

    public boolean b()
    {
        return j;
    }

    public Uri c()
    {
        return m;
    }

    public String d()
    {
        return i;
    }

    public String e()
    {
        return a;
    }

    public long f()
    {
        return h;
    }

    public Uri g()
    {
        return l;
    }

    public gzw h()
    {
        return c;
    }

    public gzw i()
    {
        return n;
    }

    public String j()
    {
        return d;
    }

    public long k()
    {
        return k;
    }

    public jvz l()
    {
        return e;
    }

    public ksv m()
    {
        return f;
    }

    public hut n()
    {
        return g;
    }
}
