// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

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
import anl;
import ann;
import anq;
import anw;
import aoa;
import aon;
import aoz;
import aqn;
import aqs;
import arn;
import bph;
import bqe;
import bqf;
import bqg;
import bqh;
import cf;
import cfo;
import cfz;
import cgd;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import cs;
import dbi;
import dcn;
import ddg;
import dif;
import dny;
import doc;
import dod;
import dog;
import dpn;
import drj;
import edf;
import edu;
import eee;
import eef;
import eeg;
import eep;
import eev;
import eey;
import g;
import gdv;
import hlp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jkp;
import jks;
import l;

public final class IncomingRing
    implements aqs, doc, dog
{

    private static final boolean a = false;
    private static final long b[] = {
        1000L, 1000L, 1000L, 1000L, 1000L, 1000L
    };
    private static String c;
    private static IncomingRing d;
    private final edu A = new edu("Babel_calls");
    private final String B;
    private final cfz C;
    private Bitmap D;
    private boolean E;
    private boolean F;
    private final Runnable G = new bqe(this);
    private final dif e;
    private final aoa f;
    private final bph g;
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

    private IncomingRing(dif dif1, long l1, bph bph1, String s1, String s2, String s3, 
            String s4, String s5)
    {
        Object obj = null;
        super();
        e = dif1;
        g = bph1;
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
        f = dcn.a(g.a(), null);
        o = (NotificationManager)e.getSystemService("notification");
        if (TextUtils.isEmpty(s5))
        {
            dif1 = obj;
        } else
        {
            dif1 = g.a(s3, s5, false, null, null, 0);
        }
        C = dif1;
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
            d.x();
        }
    }

    private static void a(aoa aoa1, IncomingRing incomingring)
    {
        d = incomingring;
        cfo.a(g.nU, aoa1.h());
    }

    public static void a(IncomingRing incomingring)
    {
        incomingring.a(false, 4, 0);
    }

    static void a(dif dif1, long l1, bph bph1, String s1, String s2, String s3, String s4, 
            String s5)
    {
        dif1 = new IncomingRing(dif1, l1, bph1, s1, s2, s3, s4, s5);
        if (((IncomingRing) (dif1)).m != null)
        {
            dod.a(((IncomingRing) (dif1)).f).a(new anw(((IncomingRing) (dif1)).m, dif1));
        }
        int i1;
        boolean flag;
        if (dif1.i())
        {
            dny.a(((IncomingRing) (dif1)).B, true, ((IncomingRing) (dif1)).f, dif1);
        } else
        {
            dny.a(cgd.a(((IncomingRing) (dif1)).h), ((IncomingRing) (dif1)).f, dif1);
        }
        ((IncomingRing) (dif1)).e.h();
        bph1 = ((IncomingRing) (dif1)).e.getResources();
        s2 = g.nU;
        i1 = eee.a(((IncomingRing) (dif1)).f.h(), 3, 3, ((IncomingRing) (dif1)).g.e());
        s1 = g.a(dif1.f(), null, true, 62, dif1.t(), SystemClock.elapsedRealtime());
        s1.putExtra("from_notification", true);
        s1 = PendingIntent.getActivity(s2, i1, s1, 0x8000000);
        s3 = c;
        s4 = (new Intent("com.google.android.apps.hangouts.hangout.ignore")).setClass(g.nU, com/google/android/apps/hangouts/hangout/IncomingRing$NotificationActionReceiver);
        s4.putExtra("hangout_incoming_notification_tag", s3);
        s3 = PendingIntent.getBroadcast(s2, i1 + 1, s4, 0x8000000);
        s2 = PendingIntent.getActivity(s2, i1 + 2, g.i(), 0x8000000);
        s4 = (new cf(((IncomingRing) (dif1)).e)).a(System.currentTimeMillis());
        if (((IncomingRing) (dif1)).F || dif1.i())
        {
            i1 = com.google.android.apps.hangouts.R.drawable.cu;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.cq;
        }
        dif1.p = s4.a(i1).c(4).a(false).d(2).a(s2).a(com.google.android.apps.hangouts.R.drawable.aQ, bph1.getString(l.ey), s3).a(com.google.android.apps.hangouts.R.drawable.aT, bph1.getString(l.ex), s1).a((new cs()).c());
        if (((drj)hlp.a(g.nU, drj)).c(((IncomingRing) (dif1)).f.h()))
        {
            ((IncomingRing) (dif1)).p.a(b);
        }
        ((IncomingRing) (dif1)).p.c(s2);
        dif1.v();
        dif1.E = false;
        if (((AudioManager)((IncomingRing) (dif1)).e.getSystemService("audio")).getRingerMode() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new bqf(dif1, flag)).a(new Void[0]);
        a(((IncomingRing) (dif1)).f, ((IncomingRing) (dif1)));
        ((IncomingRing) (dif1)).z.postDelayed(((IncomingRing) (dif1)).G, 35000L);
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
            eev.f("Babel", s1);
            gdv.b("Expected condition to be false", E);
            return;
        }
        E = true;
        gdv.a(i1, 0, 4);
        jkp jkp1 = new jkp();
        jkp1.a = Long.valueOf(i);
        jkp1.b = f().g();
        jkp1.g = Integer.valueOf(i1);
        jks jks1 = new jks();
        jks1.a = Long.valueOf(j * 1000L);
        jks1.b = Long.valueOf(SystemClock.elapsedRealtime() - k);
        jkp1.h = jks1;
        RealTimeChatService.a(f, jkp1);
        if (i() || s())
        {
            ddg ddg1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 2;
            }
            ddg1 = new ddg(2, B, null, 0, null, null, null, 62);
            RealTimeChatService.a(f.h(), i1, ddg1);
            if (!flag && j1 != 1)
            {
                if (i() || s())
                {
                    flag1 = true;
                }
                gdv.a("Expected condition to be true", flag1);
                Object obj1 = e.getResources();
                Object obj;
                Object obj2;
                if (D != null)
                {
                    obj = D;
                } else
                {
                    obj = aon.q();
                }
                i1 = eee.a(f.h(), 1, 2, null);
                obj2 = PendingIntent.getActivity(g.nU, i1, g.g(f), 0x8000000);
                obj1 = (new cf(e)).a(System.currentTimeMillis()).a(true).c(((Resources) (obj1)).getString(l.sV)).a(com.google.android.apps.hangouts.R.drawable.cs).c(4).d(2).a(((Bitmap) (obj))).a(((PendingIntent) (obj2))).a(((Resources) (obj1)).getString(l.sV));
                if (TextUtils.isEmpty(l))
                {
                    obj = eey.p(B);
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
        for (obj = x.iterator(); ((Iterator) (obj)).hasNext(); ((bqh)((Iterator) (obj)).next()).a()) { }
        a(f, ((IncomingRing) (null)));
        e.x_();
    }

    public static aoa b(IncomingRing incomingring)
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
        if (incomingring.F || incomingring.i())
        {
            return eeg.a(android.provider.Settings.System.DEFAULT_RINGTONE_URI, new String[] {
                eep.b(g.hT)
            });
        } else
        {
            String s1 = incomingring.u();
            incomingring = g.b(incomingring.f);
            return eeg.a(android.provider.Settings.System.DEFAULT_RINGTONE_URI, new String[] {
                s1, incomingring, eep.b(g.hY)
            });
        }
    }

    public static boolean d(IncomingRing incomingring)
    {
        return incomingring.E;
    }

    public static edu e(IncomingRing incomingring)
    {
        return incomingring.A;
    }

    public static Vibrator f(IncomingRing incomingring)
    {
        return incomingring.y;
    }

    static void o()
    {
        gdv.a("Expected null", d);
        ((NotificationManager)g.nU.getSystemService("notification")).cancel(c, 3);
    }

    public static boolean p()
    {
        return a;
    }

    public static long[] q()
    {
        return b;
    }

    static IncomingRing r()
    {
        return d;
    }

    private boolean s()
    {
        return TextUtils.isEmpty(n) && TextUtils.isEmpty(l) && !i();
    }

    private int t()
    {
        return !i() ? 2 : 1;
    }

    private String u()
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
        obj1 = g.nU.getContentResolver().query(((Uri) (obj1)), bqg.a, "conversation_id=?", new String[] {
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

    private void v()
    {
        Object obj1 = e.getResources();
        if (TextUtils.isEmpty(n)) goto _L2; else goto _L1
_L1:
        Object obj = n;
_L10:
        p.a(((CharSequence) (obj))).c(((CharSequence) (obj)));
        obj1 = p;
        obj = e.getResources();
        if (!i()) goto _L4; else goto _L3
_L3:
        int i1 = l.sU;
_L8:
        obj = ((Resources) (obj)).getString(i1);
_L6:
        ((cf) (obj1)).b(((CharSequence) (obj)));
        for (obj = x.iterator(); ((Iterator) (obj)).hasNext(); ((bqh)((Iterator) (obj)).next()).b()) { }
        break; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(l))
        {
            if (i())
            {
                obj = eey.p(B);
                continue; /* Loop/switch isn't completed */
            }
            if (s())
            {
                obj = ((Resources) (obj1)).getString(l.ct);
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = new StringBuilder(l);
        obj1 = ((Resources) (obj1)).getString(l.bQ);
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
            i1 = l.te;
        } else
        {
            i1 = l.ee;
        }
        obj = ((Resources) (obj)).getString(i1, new Object[] {
            l
        });
        if (true) goto _L6; else goto _L5
_L5:
        if (F)
        {
            i1 = l.td;
        } else
        {
            i1 = l.dr;
        }
        if (true) goto _L8; else goto _L7
_L7:
        w();
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void w()
    {
        Notification notification = p.g();
        notification.flags = notification.flags | 4;
        o.notify(c, 3, notification);
    }

    private void x()
    {
        if (!TextUtils.isEmpty(m))
        {
            cfo.b(g.nU, f.h(), m);
        }
        a(true, 1, 0);
    }

    String a(Resources resources)
    {
        if (i())
        {
            int i1 = l._flddo;
            String s1;
            if (l == null)
            {
                s1 = eey.p(B);
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
                    j1 = l.sZ;
                } else
                {
                    j1 = l.dm;
                }
                return resources.getString(j1, new Object[] {
                    n
                });
            }
            int k1;
            if (F)
            {
                k1 = l.sY;
            } else
            {
                k1 = l.dl;
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
                l1 = l.ta;
            } else
            {
                l1 = l.dn;
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
                i2 = l.tb;
            } else
            {
                i2 = l.dp;
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
                j2 = g.hP;
            } else
            {
                j2 = g.hA;
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
                k2 = g.hO;
            } else
            {
                k2 = g.hz;
            }
            return resources.getQuantityString(k2, i2 - 1, new Object[] {
                Integer.valueOf(i2 - 1), l, r[0]
            });
        }
        if (i2 == 1)
        {
            if (F)
            {
                i2 = l.sX;
            } else
            {
                i2 = l.dk;
            }
            return resources.getString(i2, new Object[] {
                l, r[0]
            });
        }
        if (F)
        {
            i2 = l.tc;
        } else
        {
            i2 = l.dq;
        }
        return resources.getString(i2, new Object[] {
            l, r[0], r[1]
        });
    }

    void a(int i1)
    {
        a(false, 3, i1);
    }

    public void a(anq anq1)
    {
    }

    public void a(aoz aoz1)
    {
        cgd cgd1 = f.b();
        q = new ArrayList(aoz1.h.size());
        Iterator iterator = aoz1.h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cgd cgd2 = ((cfz)iterator.next()).b;
            if (!cgd1.a(cgd2) && !h.equals(cgd2.a))
            {
                if (s < 3)
                {
                    dny.a(cgd2, f, this);
                    s = s + 1;
                }
                q.add(cgd2);
            }
        } while (true);
        n = aoz1.d;
        v();
    }

    void a(bqh bqh1)
    {
        x.add(bqh1);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (flag)
        {
            eef1 = eef1.d();
            p.a(eef1);
            w();
            if (i())
            {
                D = eef1;
                return;
            }
        }
    }

    public void a(String s1, String s2, int i1, arn arn, aoa aoa1)
    {
        a(s1, s2, ((anq) (arn)), ((String) (null)), aoa1);
    }

    public void a(String s1, String s2, anq anq1, String s3, aoa aoa1)
    {
        boolean flag;
        if (i())
        {
            flag = B.equals(anq1.d().d);
        } else
        {
            flag = h.equals(anq1.d().a);
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
                s1 = anl.a(u, 0, Collections.emptyList(), f.a(), aon.b(), m, this, null, v, false, ann.a, true);
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
                    ((dpn)hlp.a(g.nU, dpn)).a(s1);
                    w = u.size();
                }
            }
        }
        v();
    }

    void a(boolean flag)
    {
        A.a(flag);
        if (y != null)
        {
            y.cancel();
        }
    }

    String b(Resources resources)
    {
        return resources.getString(l.dj, new Object[] {
            f.a()
        });
    }

    public void b()
    {
    }

    void b(bqh bqh1)
    {
        x.remove(bqh1);
    }

    String c()
    {
        if (i() && l != null)
        {
            return eey.p(B);
        } else
        {
            return null;
        }
    }

    aoa d()
    {
        return f;
    }

    List e()
    {
        return q;
    }

    public bph f()
    {
        return g;
    }

    String g()
    {
        return h;
    }

    String h()
    {
        return l;
    }

    boolean i()
    {
        return B != null;
    }

    boolean j()
    {
        return F;
    }

    String k()
    {
        gdv.a("Expected condition to be true", i());
        return B;
    }

    public void l()
    {
        x();
        Intent intent = g.a(f(), C, true, 62, t(), SystemClock.elapsedRealtime());
        g.nU.startActivity(intent.addFlags(0x10000000));
    }

    public void m()
    {
        if (!TextUtils.isEmpty(m))
        {
            cfo.b(g.nU, f.h(), m);
        }
        a(false, 2, 0);
    }

    public void n()
    {
        a(false, 0, 0);
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
