// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class for
{

    static volatile boolean i = true;
    public final Context a;
    public final boolean b;
    public final int c;
    public final Bundle d;
    public final Bundle e;
    public final boolean f;
    public final String g;
    public final fqk h;
    private final Object j = new Object();
    private final fov k;
    private boolean l;
    private ConnectionResult m;
    private DataHolder n;
    private DataHolder o;
    private boolean p;
    private Cursor q;
    private Exception r;
    private boolean s;
    private final Collator t = Collator.getInstance();

    protected for(Context context, fov fov1, boolean flag, int i1, Bundle bundle, Bundle bundle1, String s1)
    {
        a = context;
        k = fov1;
        b = flag;
        c = i1;
        d = bundle;
        e = bundle1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (!f)
        {
            s1 = null;
        }
        g = s1;
        if (g.m(3))
        {
            context = new fqk("aggregator");
        } else
        {
            context = fql.a;
        }
        h = context;
    }

    public static for a(Context context, fov fov1, boolean flag, int i1, Bundle bundle, Bundle bundle1, String s1, String s2)
    {
        if (TextUtils.isEmpty(s1))
        {
            return new fow(context, fov1, flag, i1, bundle, bundle1, s2);
        }
        if (!TextUtils.isEmpty(s2))
        {
            throw new IllegalArgumentException("Search aggregation doesn't support filtering by gaia-id");
        } else
        {
            return new fox(context, fov1, flag, i1, bundle, bundle1, s1);
        }
    }

    static void a(for for1)
    {
        h.b(for1.m.b());
        for1.h.a("agg start");
        Object obj;
        if (for1.q != null)
        {
            obj = for1.q;
        } else
        {
            obj = new MatrixCursor(foo.a);
        }
        obj = for1.a(new fou(for1.n), new fou(for1.o), ((Cursor) (obj)));
        for1.h.a("agg finish");
        for1.h.b("PeopleAggregator");
        for1.k.a(0, ((fqp) (obj)));
    }

    protected static void a(fou fou1, HashMap hashmap)
    {
        fou1.a(-1);
        do
        {
            if (!fou1.c())
            {
                break;
            }
            String s1 = fou1.a("gaia_id");
            if (!TextUtils.isEmpty(s1))
            {
                hashmap.put(s1, Integer.valueOf(fou1.b()));
            }
        } while (true);
    }

    public static void a(boolean flag)
    {
        i = flag;
    }

    static void b(for for1)
    {
        for1.e();
    }

    private void d()
    {
        try
        {
            (new fot(this)).start();
            return;
        }
        catch (Exception exception)
        {
            g.a("PeopleAggregator", "Unable to start thread", exception);
            a(((Cursor) (null)), exception);
            return;
        }
    }

    private void e()
    {
label0:
        {
            synchronized (j)
            {
                h.b(l);
                h.b(p);
                if (n != null)
                {
                    n.i();
                }
                if (o != null)
                {
                    o.i();
                }
                if (q != null)
                {
                    q.close();
                }
                if (!s)
                {
                    break label0;
                }
            }
            return;
        }
        s = true;
        obj;
        JVM INSTR monitorexit ;
        k.a(8, null);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void f()
    {
label0:
        {
            synchronized (j)
            {
                if (l && p)
                {
                    break label0;
                }
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        if (!m.b())
        {
            e();
            return;
        }
        break MISSING_BLOCK_LABEL_46;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        try
        {
            (new fos(this)).start();
            return;
        }
        catch (Exception exception)
        {
            g.a("PeopleAggregator", "Unable to start thread", exception);
        }
        e();
        return;
    }

    protected int a(Cursor cursor, fqm fqm1, fpj fpj1, HashMap hashmap)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        int i1;
        int j1;
        long l2;
        i1 = -1;
        l2 = -1L;
        cursor.moveToPosition(-1);
        arraylist = new ArrayList(3);
        arraylist1 = new ArrayList(6);
        j1 = 0;
_L2:
        if (cursor.moveToNext())
        {
            long l3 = cursor.getLong(0);
            String s1;
            int l1;
            if (l3 != l2)
            {
                arraylist.clear();
                arraylist1.clear();
                i1 = cursor.getPosition();
                int k1 = j1 + 1;
                j1 = i1;
                l2 = l3;
                i1 = k1;
            } else
            {
                int i2 = j1;
                j1 = i1;
                i1 = i2;
            }
            s1 = cursor.getString(2);
            if ("vnd.android.cursor.item/email_v2".equals(s1) || "vnd.android.cursor.item/phone_v2".equals(s1))
            {
                String s2 = cursor.getString(3);
                if (TextUtils.isEmpty(s2) || arraylist1.contains(s2))
                {
                    break MISSING_BLOCK_LABEL_242;
                }
                arraylist1.add(s2);
                s2 = (String)hashmap.get(s2);
                if (!TextUtils.isEmpty(s2) && !arraylist.contains(s2))
                {
                    arraylist.add(s2);
                    fqm1.a(s2, j1);
                    fpj1.a(Integer.valueOf(j1), s2);
                }
            }
            l1 = i1;
            i1 = j1;
            j1 = l1;
            continue; /* Loop/switch isn't completed */
        } else
        {
            return j1;
        }
        l1 = i1;
        i1 = j1;
        j1 = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected int a(String s1, String s2)
    {
        if (TextUtils.isEmpty(s1))
        {
            return !TextUtils.isEmpty(s2) ? -1 : 0;
        }
        if (TextUtils.isEmpty(s2))
        {
            return 1;
        } else
        {
            return t.compare(s1, s2);
        }
    }

    protected DataHolder a()
    {
        return o;
    }

    protected abstract foj a(fou fou1, fou fou2, Cursor cursor);

    void a(Cursor cursor, Exception exception)
    {
        if (cursor != null)
        {
            h.a("contacts loaded");
        } else
        {
            h.a("contacts load failure");
        }
        if (g.m(3))
        {
            StringBuilder stringbuilder = (new StringBuilder("Contacts loaded.  exception=")).append(exception).append("  size=");
            int i1;
            if (cursor == null)
            {
                i1 = -1;
            } else
            {
                i1 = cursor.getCount();
            }
            stringbuilder.append(i1);
            g.m(3);
        }
        synchronized (j)
        {
            p = true;
            q = cursor;
            r = exception;
        }
        f();
        return;
        cursor;
        obj;
        JVM INSTR monitorexit ;
        throw cursor;
    }

    public void a(ConnectionResult connectionresult, DataHolder adataholder[])
    {
        if (connectionresult.b())
        {
            h.a("people loaded");
        } else
        {
            h.a("people load failure");
        }
        if (g.m(3))
        {
            StringBuilder stringbuilder = (new StringBuilder("People loaded.  status=")).append(connectionresult).append("  size=");
            int i1;
            if (adataholder == null || adataholder.length < 2 || adataholder[0] == null)
            {
                i1 = -1;
            } else
            {
                i1 = adataholder[0].g();
            }
            stringbuilder.append(i1);
            g.m(3);
        }
        synchronized (j)
        {
            l = true;
            m = connectionresult;
            if (m.b())
            {
                n = adataholder[0];
                o = adataholder[1];
            }
        }
        if (!f)
        {
            f();
            return;
        }
        break MISSING_BLOCK_LABEL_160;
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
        if (m.b())
        {
            d();
            return;
        }
        synchronized (j)
        {
            p = true;
        }
        e();
        return;
        adataholder;
        connectionresult;
        JVM INSTR monitorexit ;
        throw adataholder;
    }

    public void b()
    {
        if (!f)
        {
            d();
        }
    }

    protected void b(fou fou1, HashMap hashmap)
    {
        fou1.a(-1);
        for (; fou1.c(); hashmap.put(fou1.a("value"), fou1.a("gaia_id"))) { }
    }

    protected abstract Cursor c();

}
