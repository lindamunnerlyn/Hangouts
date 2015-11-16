// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class emz
{

    ai a;
    private Account b;
    private final Set c = new HashSet();
    private int d;
    private View e;
    private String f;
    private String g;
    private final Map h = new fhb();
    private final Context i;
    private final Map j = new fhb();
    private int k;
    private int l;
    private end m;
    private Looper n;
    private eml o;
    private emu p;
    private final ArrayList q = new ArrayList();
    private final ArrayList r = new ArrayList();
    private ftw s;

    public emz(Context context)
    {
        k = -1;
        l = -1;
        o = eml.a();
        p = fuo.c;
        s = new ftw();
        i = context;
        n = context.getMainLooper();
        f = context.getPackageName();
        g = context.getClass().getName();
    }

    private epo b()
    {
        return new epo(b, c, h, d, e, f, g, s.a());
    }

    public emy a()
    {
        boolean flag;
        if (!j.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "must call addApi() to add at least one API");
        if (k >= 0)
        {
            eof eof1 = new eof(i.getApplicationContext(), n, b(), o, p, j, q, r, k, -1);
            eow eow1 = eow.a(a);
            if (eow1 == null)
            {
                (new Handler(i.getMainLooper())).post(new ena(this, eof1));
            } else
            {
                a(eow1, ((emy) (eof1)));
            }
            return eof1;
        }
        if (l >= 0)
        {
            eoz eoz1 = eoz.a(a);
            emy emy = eoz1.a(l);
            Object obj = emy;
            if (emy == null)
            {
                obj = new eof(i.getApplicationContext(), n, b(), o, p, j, q, r, -1, l);
            }
            eoz1.a(l, ((emy) (obj)), m);
            return ((emy) (obj));
        } else
        {
            return new eof(i, n, b(), o, p, j, q, r, -1, -1);
        }
    }

    public emz a(emt emt1)
    {
        j.put(emt1, null);
        c.addAll(emt1.a().a());
        return this;
    }

    public emz a(emt emt1, emv emv)
    {
        g.b(emv, "Null options are not permitted for this Api");
        j.put(emt1, emv);
        c.addAll(emt1.a().a());
        return this;
    }

    public emz a(enb enb)
    {
        q.add(enb);
        return this;
    }

    public emz a(end end)
    {
        r.add(end);
        return this;
    }

    public emz a(String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = new Account(s1, "com.google");
        }
        b = s1;
        return this;
    }

    void a(eow eow1, emy emy)
    {
        eow1.a(k, emy, m);
    }
}
