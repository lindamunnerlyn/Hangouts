// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.hangouts.video.RendererManager;
import java.util.Iterator;
import java.util.List;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class geb
    implements gmm
{

    final geg a;
    final gfr b = new gfr();
    final ghn c;
    final gnb d;
    boolean e;
    int f;
    String g;
    boolean h;
    gms i;
    private final Context j;
    private final gfu k = new gfu();
    private final gef l = new gef(this);
    private final RendererManager m;
    private final ggl n;
    private final ghy o;
    private gmx p;
    private gmk q;
    private gml r;
    private gmn s;
    private boolean t;

    geb(Context context, gmn gmn1)
    {
        e = false;
        f = 0;
        g = null;
        h = true;
        i = null;
        j = context;
        s = gmn1;
        d = new gnb(context, this);
        a = new geg(context, this);
        c = new ghn(a, b);
        m = new RendererManager(context);
        n = new ggl(context, a, k, m, c);
        o = new ghy(a, k, m, c);
        WebRtcAudioTrack.setAudioMute(false);
        a.a(l);
        gic.a().a(a);
        if (s != null)
        {
            a(context, s);
            a.b(s);
        }
    }

    private static void a(Context context, gmn gmn1)
    {
        gdv.b("accountName not specified in CallInfo!", TextUtils.isEmpty(gmn1.n()));
        new gnj();
        if (TextUtils.isEmpty(gmn1.a()))
        {
            gmn1.a(gnj.a());
        }
        if (TextUtils.isEmpty(gmn1.b()))
        {
            gmn1.b(gnj.a());
        }
        if (gmn1.o() == null)
        {
            gmn1.k(context.getPackageName());
        }
        if (gmn1.p() == null)
        {
            gmn1.l(gnj.a());
        }
        lch lch2 = gmn1.d();
        lch lch1 = lch2;
        if (lch2 == null)
        {
            gne.a(6, "vclib", "No RtcClient was provided; this will be mandatory in the future.");
            lch1 = new lch();
            lch1.b = Integer.valueOf(600);
        }
        if (lch1.a == null)
        {
            byte byte0;
            if (g.L(context))
            {
                byte0 = 3;
            } else
            {
                byte0 = 2;
            }
            lch1.a = Integer.valueOf(byte0);
        }
        lch1.c = Integer.valueOf(2);
        gmn1.a(lch1);
    }

    static void a(geb geb1)
    {
        if (!geb1.t)
        {
            geb1.a(((gmx) (null)));
            geb1.a(((gmk) (null)));
            geb1.a(((gml) (null)));
            geb1.n.a();
            geb1.o.a();
            geb1.c.a();
            geb1.m.a();
            geb1.k.a();
            geb1.d.b();
            geb1.t = true;
        }
    }

    static void a(geb geb1, geu geu1)
    {
        if (geb1.f != 0 && geu1 != null && geb1.s != null)
        {
            Object obj = geu1.a(geb1.j, geb1.s.c(), geb1.s.e(), geb1.a.b(), geb1.s.r());
            geu1 = new ggn(geb1.j);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                jjt jjt1 = (jjt)((Iterator) (obj)).next();
                geb1.b.a(jjt1);
                if (geb1.s.y())
                {
                    geu1.a(geb1.s.n(), jjt1);
                }
            }
        }
    }

    private static void a(String s1, String s2, boolean flag, String s3)
    {
        if (s1 == null)
        {
            if (!flag)
            {
                s1 = String.valueOf(s3);
                if (s1.length() != 0)
                {
                    s1 = "Field cannot be set after initCall: ".concat(s1);
                } else
                {
                    s1 = new String("Field cannot be set after initCall: ");
                }
                gdv.a(s1, s2);
            }
            return;
        }
        s3 = String.valueOf(s3);
        if (s3.length() != 0)
        {
            s3 = "Field cannot be changed after initCall: ".concat(s3);
        } else
        {
            s3 = new String("Field cannot be changed after initCall: ");
        }
        gdv.a(s3, s1, s2);
    }

    public RendererManager a()
    {
        return m;
    }

    public void a(int i1)
    {
        if (f == 4 || f == 3)
        {
            return;
        } else
        {
            f = 3;
            g.a(new ged(this, i1));
            return;
        }
    }

    public void a(gmk gmk1)
    {
        if (q != null)
        {
            q.a();
        }
        q = gmk1;
        if (q == null)
        {
            a(true);
            return;
        } else
        {
            q.a(this);
            return;
        }
    }

    public void a(gml gml1)
    {
        if (r != null)
        {
            r.a();
        }
        r = gml1;
        if (r != null)
        {
            r.a(this);
        }
    }

    public void a(gmn gmn1)
    {
        if (f != 0)
        {
            gne.a(5, "vclib", "Attempted to join a call that has already been joined.");
            return;
        }
        if (s != null) goto _L2; else goto _L1
_L1:
        a(j, gmn1);
_L4:
        s = gmn1;
        gne.a(4, "vclib", gmn1.toString());
        d.a(2689);
        f = 1;
        g.a(new gec(this, gmn1));
        return;
_L2:
        gmn gmn2 = s;
        a(gmn2.n(), gmn1.n(), false, "accountName");
        a(gmn2.a(), gmn1.a(), false, "sessionId");
        a(gmn2.b(), gmn1.b(), false, "participantLogId");
        a(gmn2.o(), gmn1.o(), false, "clientId");
        a(gmn2.p(), gmn1.p(), false, "gcmRegistration");
        a(gmn2.q(), gmn1.q(), false, "compressedLogFile");
        a(gmn2.f(), gmn1.f(), true, "resolvedHangoutId");
        if (gmn2.z() != null)
        {
            gdv.a("VideoCallOptions can not be modified after initCall.", kws.messageNanoEquals(gmn2.z(), gmn1.z()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(gmo gmo1)
    {
        b.a(gmo1);
        if (f == 2)
        {
            gmo1.a(i);
            ghm ghm1 = c.b();
            if (ghm1 != null)
            {
                gmo1.d(ghm1.b());
            }
        }
    }

    public void a(gmw gmw)
    {
        k.a(gmw);
    }

    public void a(gmx gmx1)
    {
        if (p != null)
        {
            p.g();
        }
        p = gmx1;
        if (p == null)
        {
            n.c().b(true);
            return;
        } else
        {
            gmx1 = n.c();
            gmx1.b(0);
            gmx1.a(60);
            gmx1.c(false);
            gmx1.a(null);
            p.a(this, gmx1);
            return;
        }
    }

    public void a(String s1)
    {
        if (f != 2)
        {
            gne.a(5, "vclib", "Attempted to mute participant while not in a call.");
            return;
        } else
        {
            a.a(s1);
            return;
        }
    }

    public void a(String s1, gmw gmw)
    {
        gdv.b("bindVideoToSurface requires a valid participantId", s1);
        gio gio = null;
        if ("localParticipant".equals(s1))
        {
            gio = c.c().c();
        } else
        {
            ghm ghm1 = c.a(s1);
            if (ghm1 != null)
            {
                gio = ghm1.c();
            }
        }
        if (gio == null)
        {
            gne.a(5, "vclib", (new StringBuilder(String.valueOf(s1).length() + 90)).append("Attempted to bind video for participant: ").append(s1).append(" but there is no VideoSource for this participant").toString());
            return;
        } else
        {
            String s2 = String.valueOf(gmw);
            gne.a(2, "vclib", (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length())).append("Binding video for ").append(s1).append(" surface: ").append(s2).toString());
            k.a(gmw, gio);
            return;
        }
    }

    public void a(boolean flag)
    {
        h = flag;
        k();
        ghm ghm1 = c.c();
        gkq gkq1 = ghm1.d();
        if (gkq1 != null)
        {
            gkq1.a(flag);
        }
        ghm1.f();
    }

    public ggl b()
    {
        return n;
    }

    public void b(gmo gmo1)
    {
        b.b(gmo1);
    }

    public void b(String s1)
    {
        if (f != 2)
        {
            gne.a(5, "vclib", "Attempted to kick participant while not in a call.");
            return;
        } else
        {
            a.b(s1);
            return;
        }
    }

    public void c(String s1)
    {
        c.b(s1);
    }

    public boolean c()
    {
        return f == 2;
    }

    public gmq d()
    {
        Object obj1 = null;
        geu geu1 = a.a();
        gmq gmq1 = (new gmq()).a(s).a(i);
        Object obj;
        int i1;
        if (s == null)
        {
            obj = null;
        } else
        {
            obj = s.b();
        }
        gmq1 = gmq1.c(((String) (obj)));
        if (geu1 == null)
        {
            obj = null;
        } else
        {
            obj = geu1.g();
        }
        gmq1 = gmq1.a(((String) (obj)));
        if (geu1 == null)
        {
            obj = obj1;
        } else
        {
            obj = geu1.h();
        }
        obj = gmq1.b(((String) (obj)));
        if (geu1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = geu1.o();
        }
        return ((gmq) (obj)).a(i1);
    }

    public gmx e()
    {
        return p;
    }

    public gmk f()
    {
        return q;
    }

    public gml g()
    {
        return r;
    }

    public gdr h()
    {
        return a.c();
    }

    gmo i()
    {
        return b;
    }

    public gnb j()
    {
        return d;
    }

    void k()
    {
        if (!e)
        {
            return;
        }
        ghm ghm1 = c.c();
        if (ghm1.d() != null)
        {
            a.b(h);
            return;
        } else
        {
            c.a(new gee(this, ghm1));
            return;
        }
    }
}
