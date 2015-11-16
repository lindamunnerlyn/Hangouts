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

public final class hfv
{

    private final String a;
    private final Context b;
    private final hem c;
    private final String d;
    private final kec e;
    private final lay f;
    private final hzx g;
    private long h;
    private String i;
    private boolean j;
    private long k;
    private Uri l;
    private Uri m;
    private hem n;

    hfv(Context context, Uri uri, String s, String s1, kec kec, lay lay, hzx hzx)
    {
        b = context;
        l = uri;
        m = uri;
        d = s;
        e = kec;
        f = lay;
        g = hzx;
        long l1;
        if (s1 == null)
        {
            s1 = g.a(context, uri);
        }
        a = s1;
        context = a(m);
        c = context;
        n = c;
        if (context == null)
        {
            l1 = 0L;
        } else
        {
            l1 = context.b();
        }
        k = l1;
        if (k <= 0L)
        {
            context = String.valueOf(m);
            throw new hew((new StringBuilder(String.valueOf(context).length() + 17)).append("Empty content at ").append(context).toString());
        }
        s = null;
        int i1;
        if (hpj.b(uri))
        {
            context = a(uri, a);
            s = ((hfw) (context)).a;
            h = ((hfw) (context)).b;
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

    private hem a(Uri uri)
    {
        ContentResolver contentresolver = b.getContentResolver();
        try
        {
            uri = hem.a(contentresolver.openInputStream(uri));
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

    private hfw a(Uri uri, String s)
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
        uri = new hfw(s.getString(s.getColumnIndexOrThrow("_data")), s.getLong(s.getColumnIndexOrThrow("datetaken")));
        if (s != null)
        {
            s.close();
        }
        return uri;
        if (!hpj.b(s) && !hpj.c(s)) goto _L2; else goto _L1
_L2:
        uri = String.valueOf(uri);
        throw new hev((new StringBuilder(String.valueOf(uri).length() + 20)).append("Invalid content at: ").append(uri).toString(), true);
        uri = String.valueOf(uri);
        throw new hew((new StringBuilder(String.valueOf(uri).length() + 20)).append("No content for URI: ").append(uri).toString());
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
            n = ((hem) (obj));
            k = ((hem) (obj)).b();
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

    public hem h()
    {
        return c;
    }

    public hem i()
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

    public kec l()
    {
        return e;
    }

    public lay m()
    {
        return f;
    }

    public hzx n()
    {
        return g;
    }
}
