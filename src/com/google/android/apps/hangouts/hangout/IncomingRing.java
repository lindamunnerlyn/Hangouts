// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import amt;
import amv;
import amy;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import ane;
import ani;
import anv;
import aoh;
import apw;
import aqb;
import aqw;
import boy;
import bpv;
import bpw;
import bpx;
import bpy;
import cej;
import ceu;
import cey;
import cf;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dac;
import dbf;
import dbx;
import dgw;
import dlb;
import dlf;
import dlg;
import dlj;
import dmt;
import eab;
import eaq;
import eba;
import ebh;
import ebi;
import ebr;
import ebw;
import ebz;
import g;
import gbh;
import hgx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jed;
import jeg;
import l;

public final class IncomingRing
    implements aqb, dlf, dlj
{

    private static final boolean a = false;
    private static final long b[] = {
        1000L, 1000L
    };
    private static String c;
    private static IncomingRing d;
    private final eaq A = new eaq("Babel_calls");
    private final String B;
    private final ceu C;
    private Bitmap D;
    private boolean E;
    private boolean F;
    private final Runnable G = new bpv(this);
    private final dgw e;
    private final ani f;
    private final boy g;
    private final String h;
    private final long i;
    private final long j = System.currentTimeMillis();
    private final long k = SystemClock.elapsedRealtime();
    private String l;
    private final String m;
    private String n;
    private final NotificationManager o;
    private cf p;
    private List q;
    private final String r[] = new String[3];
    private int s;
    private int t;
    private final List u = new ArrayList(4);
    private String v;
    private int w;
    private final ArrayList x = new ArrayList();
    private Vibrator y;
    private final Handler z = new Handler();

    private IncomingRing(dgw dgw1, long l1, boy boy1, String s1, String s2, String s3, 
            String s4, String s5)
    {
        Object obj = null;
        super();
        e = dgw1;
        g = boy1;
        h = s1;
        m = s2;
        B = s3;
        i = l1;
        l = s4;
        boolean flag;
        if (g.l() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        F = flag;
        f = dbf.a(g.a(), null);
        o = (NotificationManager)e.getSystemService("notification");
        if (TextUtils.isEmpty(s5))
        {
            dgw1 = obj;
        } else
        {
            dgw1 = g.a(s3, s5, false, null, null, 0);
        }
        C = dgw1;
    }

    public static Vibrator a(IncomingRing incomingring, Vibrator vibrator)
    {
        incomingring.y = vibrator;
        return vibrator;
    }

    public static IncomingRing a()
    {
        return d;
    }

    static void a(Intent intent)
    {
        if (d != null && intent.getBooleanExtra("from_notification", false))
        {
            d.w();
        }
    }

    private static void a(ani ani1, IncomingRing incomingring)
    {
        d = incomingring;
        cej.a(g.nS, ani1.h());
    }

    public static void a(IncomingRing incomingring)
    {
        incomingring.a(false, 4, 0);
    }

    static void a(dgw dgw1, long l1, boy boy1, String s1, String s2, String s3, String s4, 
            String s5)
    {
        dgw1 = new IncomingRing(dgw1, l1, boy1, s1, s2, s3, s4, s5);
        if (((IncomingRing) (dgw1)).m != null)
        {
            dlg.a(((IncomingRing) (dgw1)).f).a(new ane(((IncomingRing) (dgw1)).m, dgw1));
        }
        int i1;
        boolean flag;
        if (dgw1.h())
        {
            dlb.a(((IncomingRing) (dgw1)).B, true, ((IncomingRing) (dgw1)).f, dgw1);
        } else
        {
            dlb.a(cey.a(((IncomingRing) (dgw1)).h), ((IncomingRing) (dgw1)).f, dgw1);
        }
        ((IncomingRing) (dgw1)).e.h();
        boy1 = ((IncomingRing) (dgw1)).e.getResources();
        s2 = g.nS;
        i1 = eba.a(((IncomingRing) (dgw1)).f.h(), 3, 3, ((IncomingRing) (dgw1)).g.e());
        s1 = g.a(dgw1.e(), null, true, 62, dgw1.s(), SystemClock.elapsedRealtime());
        s1.putExtra("from_notification", true);
        s1 = PendingIntent.getActivity(s2, i1, s1, 0x8000000);
        s3 = c;
        s4 = (new Intent("com.google.android.apps.hangouts.hangout.ignore")).setClass(g.nS, com/google/android/apps/hangouts/hangout/IncomingRing$NotificationActionReceiver);
        s4.putExtra("hangout_incoming_notification_tag", s3);
        s3 = PendingIntent.getBroadcast(s2, i1 + 1, s4, 0x8000000);
        s2 = PendingIntent.getActivity(s2, i1 + 2, g.j(), 0x8000000);
        s4 = (new cf(((IncomingRing) (dgw1)).e)).a(System.currentTimeMillis());
        if (((IncomingRing) (dgw1)).F || dgw1.h())
        {
            i1 = com.google.android.apps.hangouts.R.drawable.cC;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.cy;
        }
        dgw1.p = s4.a(i1).c(4).c().a(false).d(2).a(s2).a(com.google.android.apps.hangouts.R.drawable.aU, boy1.getString(l.eP), s3).a(com.google.android.apps.hangouts.R.drawable.aX, boy1.getString(l.eO), s1);
        ((IncomingRing) (dgw1)).p.c(s2);
        dgw1.u();
        dgw1.E = false;
        if (((AudioManager)((IncomingRing) (dgw1)).e.getSystemService("audio")).getRingerMode() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new bpw(dgw1, flag)).a(new Void[0]);
        a(((IncomingRing) (dgw1)).f, ((IncomingRing) (dgw1)));
        ((IncomingRing) (dgw1)).z.postDelayed(((IncomingRing) (dgw1)).G, 35000L);
    }

    static void a(String s1)
    {
        c = s1;
    }

    private void a(boolean flag, int i1, int j1)
    {
        boolean flag1 = false;
        if (E)
        {
            String s1;
            if (d == this)
            {
                s1 = "same";
            } else
            if (d == null)
            {
                s1 = "null";
            } else
            {
                s1 = "different";
            }
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "Stop called twice. ActiveRing ".concat(s1);
            } else
            {
                s1 = new String("Stop called twice. ActiveRing ");
            }
            ebw.f("Babel", s1);
            gbh.b(E);
            return;
        }
        E = true;
        gbh.a(i1, 0, 4);
        jed jed1 = new jed();
        jed1.a = Long.valueOf(i);
        jed1.b = e().g();
        jed1.g = Integer.valueOf(i1);
        jeg jeg1 = new jeg();
        jeg1.a = Long.valueOf(j * 1000L);
        jeg1.b = Long.valueOf(SystemClock.elapsedRealtime() - k);
        jed1.h = jeg1;
        RealTimeChatService.a(f, jed1);
        if (h() || r())
        {
            dbx dbx1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 2;
            }
            dbx1 = new dbx(2, B, null, 0, null, null, null, 62);
            RealTimeChatService.a(f.h(), i1, dbx1);
            if (!flag && j1 != 1)
            {
                if (h() || r())
                {
                    flag1 = true;
                }
                gbh.a(flag1);
                Object obj1 = e.getResources();
                Object obj;
                Object obj2;
                if (D != null)
                {
                    obj = D;
                } else
                {
                    obj = anv.q();
                }
                i1 = eba.a(f.h(), 1, 2, null);
                obj2 = PendingIntent.getActivity(g.nS, i1, g.h(f), 0x8000000);
                obj1 = (new cf(e)).a(System.currentTimeMillis()).a(true).c(((Resources) (obj1)).getString(l.tD)).a(com.google.android.apps.hangouts.R.drawable.cA).c(4).d(2).a(((Bitmap) (obj))).a(((PendingIntent) (obj2))).a(((Resources) (obj1)).getString(l.tD));
                if (TextUtils.isEmpty(l))
                {
                    obj = ebz.p(B);
                } else
                {
                    obj = l;
                }
                obj = ((cf) (obj1)).b(((CharSequence) (obj))).g();
                obj1 = o;
                obj2 = String.valueOf(e.getPackageName());
                i1 = f.h();
                ((NotificationManager) (obj1)).notify((new StringBuilder(String.valueOf(obj2).length() + 37)).append(((String) (obj2))).append(":missed_pstn_notification:").append(i1).toString(), 2, ((Notification) (obj)));
            }
            D = null;
        }
        o.cancel(c, 3);
        z.removeCallbacks(G);
        a(flag);
        for (obj = x.iterator(); ((Iterator) (obj)).hasNext(); ((bpy)((Iterator) (obj)).next()).a()) { }
        a(f, ((IncomingRing) (null)));
        e.x_();
    }

    public static ani b(IncomingRing incomingring)
    {
        return incomingring.f;
    }

    static void b(String s1)
    {
        s1 = String.valueOf(s1);
        String s2 = String.valueOf(":hangouts_ring_notification");
        if (s2.length() != 0)
        {
            s1 = s1.concat(s2);
        } else
        {
            s1 = new String(s1);
        }
        c = s1;
    }

    public static Uri c(IncomingRing incomingring)
    {
        if (incomingring.F || incomingring.h())
        {
            return ebi.a(android.provider.Settings.System.DEFAULT_RINGTONE_URI, new String[] {
                ebr.b(g.ib)
            });
        } else
        {
            String s1 = incomingring.t();
            incomingring = g.c(incomingring.f);
            return ebi.a(android.provider.Settings.System.DEFAULT_RINGTONE_URI, new String[] {
                s1, incomingring, ebr.b(g.ig)
            });
        }
    }

    public static boolean d(IncomingRing incomingring)
    {
        return incomingring.E;
    }

    public static eaq e(IncomingRing incomingring)
    {
        return incomingring.A;
    }

    public static Vibrator f(IncomingRing incomingring)
    {
        return incomingring.y;
    }

    static void n()
    {
        gbh.a(d);
        ((NotificationManager)g.nS.getSystemService("notification")).cancel(c, 3);
    }

    public static boolean o()
    {
        return a;
    }

    public static long[] p()
    {
        return b;
    }

    static IncomingRing q()
    {
        return d;
    }

    private boolean r()
    {
        return TextUtils.isEmpty(n) && TextUtils.isEmpty(l) && !h();
    }

    private int s()
    {
        return !h() ? 2 : 1;
    }

    private String t()
    {
        Object obj = null;
        if (m != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        Object obj1;
        s1 = m;
        obj1 = EsProvider.a(EsProvider.g, f.h());
        obj1 = g.nS.getContentResolver().query(((Uri) (obj1)), bpx.a, "conversation_id=?", new String[] {
            s1
        }, null);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Cursor) (obj1)).getString(0);
        s1 = ((String) (obj));
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return ((String) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return null;
        Exception exception;
        exception;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void u()
    {
        Object obj1 = e.getResources();
        if (TextUtils.isEmpty(n)) goto _L2; else goto _L1
_L1:
        Object obj = n;
_L10:
        p.a(((CharSequence) (obj))).c(((CharSequence) (obj)));
        obj1 = p;
        obj = e.getResources();
        if (!h()) goto _L4; else goto _L3
_L3:
        int i1 = l.tC;
_L8:
        obj = ((Resources) (obj)).getString(i1);
_L6:
        ((cf) (obj1)).b(((CharSequence) (obj)));
        for (obj = x.iterator(); ((Iterator) (obj)).hasNext(); ((bpy)((Iterator) (obj)).next()).b()) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(l))
        {
            if (h())
            {
                obj = ebz.p(B);
                continue; /* Loop/switch isn't completed */
            }
            if (r())
            {
                obj = ((Resources) (obj1)).getString(l.cK);
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = new StringBuilder(l);
        obj1 = ((Resources) (obj1)).getString(l.bW);
        for (i1 = 0; i1 < t; i1++)
        {
            ((StringBuilder) (obj)).append(((String) (obj1))).append(r[i1]);
        }

        obj = ((StringBuilder) (obj)).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        if (TextUtils.isEmpty(n) || TextUtils.isEmpty(l))
        {
            break; /* Loop/switch isn't completed */
        }
        if (F)
        {
            i1 = l.tM;
        } else
        {
            i1 = l.ev;
        }
        obj = ((Resources) (obj)).getString(i1, new Object[] {
            l
        });
        if (true) goto _L6; else goto _L5
_L5:
        if (F)
        {
            i1 = l.tL;
        } else
        {
            i1 = l.dI;
        }
        if (true) goto _L8; else goto _L7
_L7:
        v();
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void v()
    {
        Notification notification = p.g();
        notification.flags = notification.flags | 4;
        o.notify(c, 3, notification);
    }

    private void w()
    {
        if (!TextUtils.isEmpty(m))
        {
            cej.b(g.nS, f.h(), m);
        }
        a(true, 1, 0);
    }

    String a(Resources resources)
    {
        if (h())
        {
            int i1 = l.dF;
            String s1;
            if (l == null)
            {
                s1 = ebz.p(B);
            } else
            {
                s1 = l;
            }
            return resources.getString(i1, new Object[] {
                s1
            });
        }
        if (!TextUtils.isEmpty(n))
        {
            if (l == null)
            {
                int j1;
                if (F)
                {
                    j1 = l.tH;
                } else
                {
                    j1 = l.dD;
                }
                return resources.getString(j1, new Object[] {
                    n
                });
            }
            int k1;
            if (F)
            {
                k1 = l.tG;
            } else
            {
                k1 = l.dC;
            }
            return resources.getString(k1, new Object[] {
                n, l
            });
        }
        if (l == null)
        {
            int l1;
            if (F)
            {
                l1 = l.tI;
            } else
            {
                l1 = l.dE;
            }
            return resources.getString(l1);
        }
        int i2;
        if (q == null)
        {
            i2 = 0;
        } else
        {
            i2 = q.size();
        }
        if (i2 == 0)
        {
            if (F)
            {
                i2 = l.tJ;
            } else
            {
                i2 = l.dG;
            }
            return resources.getString(i2, new Object[] {
                l
            });
        }
        if (t < i2)
        {
            int j2;
            if (F)
            {
                j2 = g.hX;
            } else
            {
                j2 = g.hI;
            }
            return resources.getQuantityString(j2, i2, new Object[] {
                Integer.valueOf(i2), l
            });
        }
        if (i2 > 2)
        {
            int k2;
            if (F)
            {
                k2 = g.hW;
            } else
            {
                k2 = g.hH;
            }
            return resources.getQuantityString(k2, i2 - 1, new Object[] {
                Integer.valueOf(i2 - 1), l, r[0]
            });
        }
        if (i2 == 1)
        {
            if (F)
            {
                i2 = l.tF;
            } else
            {
                i2 = l.dB;
            }
            return resources.getString(i2, new Object[] {
                l, r[0]
            });
        }
        if (F)
        {
            i2 = l.tK;
        } else
        {
            i2 = l.dH;
        }
        return resources.getString(i2, new Object[] {
            l, r[0], r[1]
        });
    }

    void a(int i1)
    {
        a(false, 3, i1);
    }

    public void a(amy amy1)
    {
    }

    public void a(aoh aoh1)
    {
        cey cey1 = f.b();
        q = new ArrayList(aoh1.h.size());
        Iterator iterator = aoh1.h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cey cey2 = ((ceu)iterator.next()).b;
            if (!cey1.a(cey2) && !h.equals(cey2.a))
            {
                if (s < 3)
                {
                    dlb.a(cey2, f, this);
                    s = s + 1;
                }
                q.add(cey2);
            }
        } while (true);
        n = aoh1.d;
        u();
    }

    void a(bpy bpy1)
    {
        x.add(bpy1);
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(eab);
        if (flag)
        {
            ebh1 = ebh1.d();
            p.a(ebh1);
            v();
            if (h())
            {
                D = ebh1;
                return;
            }
        }
    }

    public void a(String s1, String s2, int i1, aqw aqw, ani ani1)
    {
        a(s1, s2, ((amy) (aqw)), ((String) (null)), ani1);
    }

    public void a(String s1, String s2, amy amy1, String s3, ani ani1)
    {
        boolean flag;
        if (h())
        {
            flag = B.equals(amy1.d().d);
        } else
        {
            flag = h.equals(amy1.d().a);
        }
        if (flag)
        {
            if (s1 != null && !TextUtils.isEmpty(s1))
            {
                l = s1;
            }
            u.add(0, s2);
        } else
        if (t < 3)
        {
            s1 = r;
            int j1 = t;
            t = j1 + 1;
            s1[j1] = s3;
            u.add(s2);
        }
        if (u.size() != w)
        {
            int i1 = s;
            if (u.size() <= 1 || u.size() == i1 + 1)
            {
                s1 = amt.a(u, 0, Collections.emptyList(), f.a(), anv.b(), m, this, null, v, false, amv.a, true);
                if (s1 != null)
                {
                    if (u.size() > 1 || android.os.Build.VERSION.SDK_INT > 20)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    s1.a(flag);
                    v = s1.c();
                    ((dmt)hgx.a(g.nS, dmt)).a(s1);
                    w = u.size();
                }
            }
        }
        u();
    }

    void a(boolean flag)
    {
        A.a(flag);
        if (y != null)
        {
            y.cancel();
        }
    }

    String b()
    {
        if (h() && l != null)
        {
            return ebz.p(B);
        } else
        {
            return null;
        }
    }

    String b(Resources resources)
    {
        return resources.getString(l.dA, new Object[] {
            f.a()
        });
    }

    void b(bpy bpy1)
    {
        x.remove(bpy1);
    }

    ani c()
    {
        return f;
    }

    List d()
    {
        return q;
    }

    public boy e()
    {
        return g;
    }

    String f()
    {
        return h;
    }

    String g()
    {
        return l;
    }

    boolean h()
    {
        return B != null;
    }

    boolean i()
    {
        return F;
    }

    String j()
    {
        gbh.a(h());
        return B;
    }

    public void k()
    {
        w();
        Intent intent = g.a(e(), C, true, 62, s(), SystemClock.elapsedRealtime());
        g.nS.startActivity(intent.addFlags(0x10000000));
    }

    public void l()
    {
        if (!TextUtils.isEmpty(m))
        {
            cej.b(g.nS, f.h(), m);
        }
        a(false, 2, 0);
    }

    public void m()
    {
        a(false, 0, 0);
    }

    static 
    {
        hik hik = ebw.e;
    }
}
