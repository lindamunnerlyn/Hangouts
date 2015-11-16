// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ced
{

    private static final String a = com/google/android/apps/hangouts/phone/BabelHomeActivity.getName();
    private static final Map b = new gz();
    private static int c;
    private static Bitmap d;
    public static final boolean m = false;
    public static final Set n = new HashSet();
    private boolean e;
    private boolean f;
    private boolean g;
    private List h;
    private List i;
    private int j;
    public final Context o;
    public final int p;
    public final dzx q;
    public final HashSet r;
    public cr s;
    public cf t;
    public cs u;
    public cf v;
    public final Set w;

    public ced(Context context, int i1, dzx dzx1)
    {
        r = new HashSet();
        u = new cs();
        h = new ArrayList();
        i = new LinkedList();
        w = new HashSet();
        o = context;
        p = i1;
        q = dzx1;
        synchronized (n)
        {
            a(j(), e());
            n.add(this);
        }
        t = new cf(context);
        v = new cf(context);
        v.a(d());
        v.a(context.getString(l.p));
        v.b(context.getString(l.jF));
        return;
        context;
        dzx1;
        JVM INSTR monitorexit ;
        throw context;
    }

    protected static dl a(Context context)
    {
        String as[] = context.getResources().getStringArray(g.cS);
        String as1[] = new String[as.length + 3];
        System.arraycopy(as, 0, as1, 0, as.length);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            as1[as.length] = "\uD83D\uDE03";
            as1[as.length + 1] = "\uD83D\uDE1E";
            as1[as.length + 2] = "\uD83D\uDC9C";
        } else
        {
            as1[as.length] = ":-)";
            as1[as.length + 1] = ":-(";
            as1[as.length + 2] = "\u2764";
        }
        return (new dm("android.intent.extra.TEXT")).a(context.getString(l.he)).a(as1).b();
    }

    protected static String a(Context context, int i1, String s1)
    {
        context = String.valueOf(context.getPackageName());
        return (new StringBuilder(String.valueOf(context).length() + 12 + String.valueOf(s1).length())).append(context).append(i1).append(":").append(s1).toString();
    }

    static void a(ced ced1)
    {
        ced1.m();
    }

    private void a(String s1)
    {
        Iterator iterator = i.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!TextUtils.equals(s1, ((amz)iterator.next()).a())) goto _L4; else goto _L3
_L3:
        return;
_L2:
        s1 = (new aoe(o, p)).ah(s1);
        i.clear();
        s1 = s1.iterator();
        while (s1.hasNext()) 
        {
            aoh aoh1 = (aoh)s1.next();
            amz amz1 = amz.c(dbf.e(p), aoh1.s);
            if (g.f(aoh1.c))
            {
                i.add(0, amz1);
            } else
            {
                i.add(amz1);
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected static void a(String s1, int i1)
    {
        ArrayList arraylist = new ArrayList();
        Set set = n;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ced ced1 = (ced)iterator.next();
            if (s1.equals(ced1.j()) && ced1.e() == i1)
            {
                arraylist.add(ced1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_84;
        s1;
        set;
        JVM INSTR monitorexit ;
        throw s1;
        set;
        JVM INSTR monitorexit ;
        s1 = arraylist.iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            ((ced)s1.next()).n();
            if (m)
            {
                ebw.b("Babel", "cancel found a notifier and canceled it");
            }
        } while (true);
        return;
    }

    static void b(ced ced1)
    {
        ced1.v();
    }

    protected static String c(Context context, int i1)
    {
        context = String.valueOf(context.getPackageName());
        return (new StringBuilder(String.valueOf(context).length() + 11)).append(context).append(i1).toString();
    }

    private void m()
    {
        synchronized (w)
        {
            if (w.isEmpty())
            {
                v();
            }
        }
        return;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void v()
    {
        Set set = n;
        set;
        JVM INSTR monitorenter ;
        if (!e || f || g)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        h();
_L2:
        return;
        k();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(boolean flag)
    {
        Object obj;
        boolean flag1 = false;
        obj = cej.b(o, p, o());
        Object obj1 = ebi.a(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, new String[] {
            l(), obj, ebr.b(g.ih)
        });
        int i1 = p;
        int k1 = p();
        int l1 = e();
        if (c())
        {
            obj = null;
        } else
        {
            obj = q.a();
        }
        j = eba.a(i1, k1, l1, ((String) (obj)));
        obj = b();
        if (obj != null)
        {
            t.b(PendingIntent.getService(o, j + 1, ((Intent) (obj)), 0x8000000));
        }
        if (q != null)
        {
            obj = q.a();
        } else
        {
            obj = null;
        }
        if (!flag)
        {
            if (!ebr.a(o))
            {
                Object obj2 = (Long)b.get(obj);
                if (c == 0)
                {
                    c = g.a(o, "babel_notification_time_between_rings", 10) * 1000;
                }
                long l2 = SystemClock.elapsedRealtime();
                long l3 = g.a(((Long) (obj2)), 0L);
                String s1;
                ceg ceg1;
                int j1;
                if (obj2 == null || l2 - l3 > (long)c)
                {
                    b.put(obj, Long.valueOf(l2));
                } else
                {
                    t.d();
                }
            }
            t.a(((Uri) (obj1)));
            j1 = 4;
            if (a())
            {
                j1 = 6;
            }
            t.c(j1);
        }
        t.a(s());
        t.d(f());
        if (dbf.d().length > 1)
        {
            obj = ank.c(o, p);
            if (s instanceof ce)
            {
                ((ce)s).a(((CharSequence) (obj)));
            } else
            if (s instanceof ci)
            {
                ((ci)s).a(((CharSequence) (obj)));
            }
        }
        if (!r.isEmpty())
        {
            obj = new Bundle();
            ((Bundle) (obj)).putStringArray("android.people", (String[])r.toArray(new String[r.size()]));
            t.a(((Bundle) (obj)));
        }
        if (ccx.a(o))
        {
            if (d == null)
            {
                d = BitmapFactory.decodeResource(o.getResources(), com.google.android.apps.hangouts.R.drawable.cF);
            }
            u.a(d);
        }
        if (h.isEmpty()) goto _L2; else goto _L1
_L1:
        obj1 = h;
        obj2 = Collections.emptyList();
        s1 = ((gms)hgx.a(o, gms)).a(p).b("account_name");
        j1 = anv.b();
        ceg1 = new ceg(this);
        if (((drw)hgx.a(o, drw)).b())
        {
            break MISSING_BLOCK_LABEL_806;
        }
        if (r())
        {
            obj = amv.c;
        } else
        {
            if (!q())
            {
                break MISSING_BLOCK_LABEL_806;
            }
            obj = amv.b;
        }
_L3:
        obj1 = amt.a(((List) (obj1)), 0, ((List) (obj2)), s1, j1, null, ceg1, this, null, true, ((amv) (obj)), false);
        if (obj1 != null)
        {
            if (h.size() > 1 || android.os.Build.VERSION.SDK_INT > 20)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((apw) (obj1)).a(flag);
        }
        obj = (dmt)hgx.a(o, dmt);
        ((dmt) (obj)).c(((dlt) (obj1)));
        if (ccx.a(o))
        {
            obj1 = amt.a(h, 0, Collections.emptyList(), ((gms)hgx.a(o, gms)).a(p).b("account_name"), anv.g(), null, new ceh(this), this, null, true, amv.a, false);
            if (obj1 != null)
            {
                flag = flag1;
                if (h.size() > 1)
                {
                    flag = true;
                }
                ((apw) (obj1)).a(flag);
            }
            ((dmt) (obj)).c(((dlt) (obj1)));
        }
_L2:
        e = true;
        m();
        (new Handler()).postDelayed(new cee(this), 2000L);
        return;
        obj = amv.a;
          goto _L3
    }

    public abstract boolean a();

    public abstract Intent b();

    protected void b(String s1)
    {
        a(s1);
        if (!i.isEmpty())
        {
            s1 = ((amz)i.get(0)).b().iterator();
            do
            {
                if (!s1.hasNext())
                {
                    break;
                }
                ceu ceu1 = (ceu)s1.next();
                if (!TextUtils.isEmpty(ceu1.h))
                {
                    h.add(ceu1.h);
                }
            } while (true);
        }
    }

    protected void c(String s1)
    {
        a(s1);
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((amz)iterator.next()).b().iterator();
            while (iterator1.hasNext()) 
            {
                s1 = (ceu)iterator1.next();
                if (!TextUtils.isEmpty(((ceu) (s1)).c))
                {
                    r.add(Uri.fromParts("tel", ((ceu) (s1)).c, null).toString());
                } else
                if (!TextUtils.isEmpty(s1.b()))
                {
                    chz chz1 = (chz)hgx.a(o, chz);
                    if (chz1.a("android.permission.READ_CONTACTS") || chz1.a("android.permission.WRITE_CONTACTS"))
                    {
                        Context context = o;
                        s1 = fnx.a(context, fnx.a(context, ((gms)hgx.a(o, gms)).a(p).b("account_name"), s1.b()));
                    } else
                    {
                        s1 = null;
                    }
                    if (s1 != null)
                    {
                        r.add(s1.toString());
                    }
                }
            }
        }

    }

    public abstract boolean c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract Intent g();

    protected void h()
    {
        g.b(Thread.holdsLock(n));
        t.a(d());
        t.a(s);
        t.a(u);
        t.a(true);
        t.a(v.g());
        t.e(o.getResources().getColor(g.ds));
        Notification notification = t.g();
        db db1 = db.a(o);
        notification.defaults = notification.defaults | 4;
        if (m)
        {
            String s1 = String.valueOf(notification);
            String s2 = j();
            int i1 = e();
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 51 + String.valueOf(s2).length())).append("Notifier.postNotification: ").append(s1).append(" [tag=]").append(s2).append(" [id=]").append(i1).toString());
        }
        db1.a(j(), e(), notification);
        i();
        g = true;
        n.remove(this);
    }

    protected void i()
    {
    }

    protected String j()
    {
        if (c())
        {
            return c(o, p);
        } else
        {
            return a(o, p, q.a());
        }
    }

    protected void k()
    {
    }

    protected String l()
    {
        return null;
    }

    protected void n()
    {
        synchronized (n)
        {
            if (!f)
            {
                n.remove(this);
            }
            f = true;
        }
        return;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected cel o()
    {
        return cel.b;
    }

    protected int p()
    {
        return 3;
    }

    protected boolean q()
    {
        return o() == cel.a;
    }

    protected boolean r()
    {
        return o() == cel.c;
    }

    protected final PendingIntent s()
    {
        Intent intent = g();
        intent.addFlags(0x4000000);
        dzj.a("prepareNotification notification", intent);
        dv dv1 = dv.a(o).b(intent);
        int i1 = dv1.a() - 2;
label0:
        do
        {
label1:
            {
                if (i1 >= 0)
                {
                    Intent intent1 = dv1.a(i1);
                    if (!a.equals(intent1.getComponent().getClassName()))
                    {
                        break label1;
                    }
                    intent1.setAction("com.google.android.apps.hangouts.phone.conversationlist");
                }
                if (intent.hasExtra("account_id"))
                {
                    int j1 = intent.getIntExtra("account_id", -1);
                    for (i1 = 0; i1 < dv1.a(); i1++)
                    {
                        dv1.a(i1).putExtra("account_id", j1);
                    }

                }
                break label0;
            }
            i1--;
        } while (true);
        int k1 = j;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            i1 = 0x10000000;
        } else
        {
            i1 = 0x8000000;
        }
        return dv1.a(k1, i1);
    }

    protected int t()
    {
        return j + 3;
    }

    protected int u()
    {
        return j + 2;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
