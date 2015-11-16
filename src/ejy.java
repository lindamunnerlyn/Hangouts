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

public final class ejy
{

    ai a;
    private Account b;
    private final Set c = new HashSet();
    private int d;
    private View e;
    private String f;
    private String g;
    private final Map h = new fed();
    private final Context i;
    private final Map j = new fed();
    private int k;
    private int l;
    private ekc m;
    private Looper n;
    private ejk o;
    private ejt p;
    private final ArrayList q = new ArrayList();
    private final ArrayList r = new ArrayList();
    private frp s;

    public ejy(Context context)
    {
        k = -1;
        l = -1;
        o = ejk.a();
        p = fsh.c;
        s = new frp();
        i = context;
        n = context.getMainLooper();
        f = context.getPackageName();
        g = context.getClass().getName();
    }

    private emo b()
    {
        return new emo(b, c, h, d, e, f, g, s.a());
    }

    public ejx a()
    {
        boolean flag;
        if (!j.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag, "must call addApi() to add at least one API");
        if (k >= 0)
        {
            ele ele1 = new ele(i.getApplicationContext(), n, b(), o, p, j, q, r, k, -1);
            elv elv1 = elv.a(a);
            if (elv1 == null)
            {
                (new Handler(i.getMainLooper())).post(new ejz(this, ele1));
            } else
            {
                a(elv1, ((ejx) (ele1)));
            }
            return ele1;
        }
        if (l >= 0)
        {
            ely ely1 = ely.a(a);
            ejx ejx = ely1.a(l);
            Object obj = ejx;
            if (ejx == null)
            {
                obj = new ele(i.getApplicationContext(), n, b(), o, p, j, q, r, -1, l);
            }
            ely1.a(l, ((ejx) (obj)), m);
            return ((ejx) (obj));
        } else
        {
            return new ele(i, n, b(), o, p, j, q, r, -1, -1);
        }
    }

    public ejy a(ejs ejs1)
    {
        j.put(ejs1, null);
        c.addAll(ejs1.a().a());
        return this;
    }

    public ejy a(ejs ejs1, eju eju)
    {
        h.a(eju, "Null options are not permitted for this Api");
        j.put(ejs1, eju);
        c.addAll(ejs1.a().a());
        return this;
    }

    public ejy a(eka eka)
    {
        q.add(eka);
        return this;
    }

    public ejy a(ekc ekc)
    {
        r.add(ekc);
        return this;
    }

    public ejy a(String s1)
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

    void a(elv elv1, ejx ejx)
    {
        elv1.a(k, ejx, m);
    }
}
