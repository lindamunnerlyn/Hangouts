// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import aoa;
import aon;
import bnk;
import bns;
import boj;
import bok;
import bol;
import bom;
import bon;
import boo;
import bpb;
import bpc;
import bpm;
import bpt;
import bpv;
import bqo;
import brt;
import bsh;
import bsk;
import bsn;
import bsr;
import eev;
import eey;
import g;
import gmf;
import gmh;
import gmt;
import h;
import hlp;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            ParticipantTrayView

public final class FocusedParticipantView extends FrameLayout
    implements bpb, gmh
{

    private static final boolean b = false;
    private final bns a = new bok(this);
    private int c;
    private final boo d = boo.a();
    private final bon e = new bon(this);
    private final bnk f = bnk.a();
    private ParticipantTrayView g;
    private bqo h;
    private boolean i;
    private gmt j;
    private brt k;
    private gmf l;
    private final TextureView m;
    private final View n;
    private final ImageView o;
    private final Chronometer p;
    private final View q;
    private final TextView r;
    private final View s;
    private final View t;
    private final View u;
    private boolean v;

    public FocusedParticipantView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 1;
        i = true;
        v = false;
        context = LayoutInflater.from(context).inflate(g.fV, this, true);
        m = (TextureView)context.findViewById(h.bU);
        o = (ImageView)context.findViewById(h.bC);
        n = context.findViewById(h.bB);
        p = (Chronometer)context.findViewById(h.ac);
        q = context.findViewById(h.ew);
        r = (TextView)context.findViewById(h.aA);
        s = context.findViewById(h.gv);
        t = context.findViewById(h.bz);
        u = context.findViewById(h.bA);
        n.setVisibility(0);
    }

    public static gmt a(FocusedParticipantView focusedparticipantview, gmt gmt1)
    {
        focusedparticipantview.j = gmt1;
        return gmt1;
    }

    public static void a(FocusedParticipantView focusedparticipantview)
    {
        focusedparticipantview.h();
    }

    public static gmt b(FocusedParticipantView focusedparticipantview)
    {
        return focusedparticipantview.j;
    }

    private void b(int i1)
    {
        if (c != i1)
        {
            int j1 = c;
            eev.c("Babel_calls", (new StringBuilder(67)).append("FocusedParticipantView: switch from mode=").append(j1).append(" to ").append(i1).toString());
            c = i1;
            View view = n;
            if (c == 2)
            {
                i1 = 4;
            } else
            {
                i1 = 0;
            }
            view.setVisibility(i1);
        }
    }

    public static void c(FocusedParticipantView focusedparticipantview)
    {
        focusedparticipantview.f();
    }

    public static void d(FocusedParticipantView focusedparticipantview)
    {
        boolean flag;
        if (!focusedparticipantview.i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        focusedparticipantview.i = flag;
    }

    private void e()
    {
        if (l != null)
        {
            l.a();
            l = null;
        }
        if (f.f() != null)
        {
            l = new gmf(f.f(), m);
            l.a(this);
            gmf gmf1 = l;
            boolean flag;
            if (!f.u())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gmf1.c(flag);
            l.a("focusedParticipant");
            f();
        }
    }

    private void f()
    {
        android.graphics.Bitmap bitmap;
        ImageView imageview;
        if (j != null && j.l())
        {
            bitmap = aon.j();
        } else
        {
            bitmap = aon.h();
        }
        imageview = o;
        if (k != null)
        {
            bitmap = k.k();
        }
        imageview.setImageBitmap(bitmap);
        g();
    }

    private void g()
    {
        for (Iterator iterator = hlp.c(getContext(), boj).iterator(); iterator.hasNext(); iterator.next()) { }
    }

    private void h()
    {
        long l2 = 0L;
        if (!f.u() && (j == null || !j.l())) goto _L2; else goto _L1
_L1:
        long l1;
        b(1);
        if (l != null)
        {
            l.c(false);
        }
        if (j == null || k == null)
        {
            return;
        }
        l1 = j.i();
        if (l1 <= 0L) goto _L4; else goto _L3
_L3:
        l1 = SystemClock.elapsedRealtime() - l1;
        p.setVisibility(0);
        l2 = l1;
        if (v) goto _L6; else goto _L5
_L5:
        Object obj;
        bpm bpm1;
        bsh bsh1;
        Iterator iterator;
        String s1;
        if (j != null && k != null)
        {
            p.setBase(j.i());
            p.start();
            v = true;
        }
_L7:
        bpm1 = f.s();
        if (!(k instanceof bsk))
        {
            break MISSING_BLOCK_LABEL_532;
        }
        bsh1 = ((bsk)k).l();
        if (bsh1 == null || bpm1 == null)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        iterator = bpm1.V().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_532;
            }
            obj = (bpt)iterator.next();
            s1 = eey.g(bsh1.b());
        } while (s1 == null || !s1.equals(((bpt) (obj)).a()));
_L8:
        i();
        int i1;
        if (obj != null && ((bpt) (obj)).b() != null)
        {
            r.setText(getResources().getString(l.bq, new Object[] {
                ((bpt) (obj)).b()
            }));
            r.setText(getResources().getString(l.br, new Object[] {
                ((bpt) (obj)).b()
            }));
            r.setVisibility(0);
            if (obj instanceof bpv)
            {
                obj = (bpv)obj;
                if (l1 < (long)((bpv) (obj)).d())
                {
                    if (((bpv) (obj)).c())
                    {
                        t.setVisibility(0);
                        u.setVisibility(8);
                    } else
                    {
                        t.setVisibility(8);
                        u.setVisibility(0);
                    }
                } else
                {
                    t.setVisibility(4);
                    u.setVisibility(8);
                }
            }
            i1 = 0;
        } else
        {
            r.setVisibility(8);
            i1 = 8;
        }
        if (bpm1 != null && bpm1.k().Y())
        {
            s.setVisibility(0);
            i1 = 0;
        } else
        {
            s.setVisibility(8);
        }
        q.setVisibility(i1);
        return;
_L4:
        p.setVisibility(8);
_L6:
        l1 = l2;
          goto _L7
_L2:
        if (l != null)
        {
            l.c(true);
        }
        p.setVisibility(8);
        q.setVisibility(8);
        i();
        return;
        obj = null;
          goto _L8
    }

    private void i()
    {
        t.setVisibility(8);
        u.setVisibility(8);
    }

    public void a(int i1)
    {
        if (i1 == 2)
        {
            e();
        }
    }

    public void a(bpc bpc)
    {
        d.a(e);
        f.a(a);
        if (f.f() != null)
        {
            e();
        }
    }

    void a(bqo bqo1, ParticipantTrayView participanttrayview)
    {
        g = participanttrayview;
        h = bqo1;
        setOnClickListener(new bol(this, bqo1));
        if (b)
        {
            setOnLongClickListener(new bom(this));
        }
        g();
    }

    public void a(String s1)
    {
        if (j != null && j.a().equals(s1))
        {
            f();
        }
    }

    public void b()
    {
        brt brt1 = k;
        j = f.p();
        if (j == null)
        {
            k = g.e();
        } else
        {
            k = g.a(j.a());
        }
        if (f.u() && (k instanceof bsn))
        {
            j = null;
            k = null;
        }
        if (k != brt1)
        {
            h();
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void c()
    {
        b(2);
    }

    public void d()
    {
        b(1);
    }

    public CharSequence getContentDescription()
    {
        String s1 = h.a(getContext());
        Iterator iterator = hlp.c(getContext(), bsr).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s3 = ((bsr)iterator.next()).a();
            if (s3 != null)
            {
                String s2 = s1;
                if (s3.length() > 0)
                {
                    s2 = s1;
                    if (s1.length() > 0)
                    {
                        s2 = String.valueOf(s1).concat(" ");
                    }
                }
                s1 = String.valueOf(s2);
                s2 = String.valueOf(s3);
                if (s2.length() != 0)
                {
                    s1 = s1.concat(s2);
                } else
                {
                    s1 = new String(s1);
                }
            }
        } while (true);
        return s1;
    }

    public void j_()
    {
        f.b(a);
        d.b(e);
        j = null;
        k = null;
        if (l != null)
        {
            l.a();
            l = null;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    static 
    {
        hnc hnc = eev.f;
    }
}
