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
import ani;
import anv;
import bnd;
import bnk;
import boa;
import bob;
import boc;
import bod;
import boe;
import bof;
import bos;
import bot;
import bpd;
import bpk;
import bpm;
import bqf;
import brk;
import bry;
import bsb;
import bse;
import bsi;
import ebw;
import ebz;
import g;
import gjd;
import gjf;
import gjr;
import h;
import hgx;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            ParticipantTrayView

public final class FocusedParticipantView extends FrameLayout
    implements bos, gjf
{

    private static final boolean b = false;
    private final bnk a = new bob(this);
    private int c;
    private final bof d = bof.a();
    private final boe e = new boe(this);
    private final bnd f = bnd.a();
    private ParticipantTrayView g;
    private bqf h;
    private boolean i;
    private gjr j;
    private brk k;
    private gjd l;
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
        context = LayoutInflater.from(context).inflate(g.fZ, this, true);
        m = (TextureView)context.findViewById(h.ce);
        o = (ImageView)context.findViewById(h.bI);
        n = context.findViewById(h.bH);
        p = (Chronometer)context.findViewById(h.ad);
        q = context.findViewById(h.eO);
        r = (TextView)context.findViewById(h.aF);
        s = context.findViewById(h.gN);
        t = context.findViewById(h.bF);
        u = context.findViewById(h.bG);
        n.setVisibility(0);
    }

    public static gjr a(FocusedParticipantView focusedparticipantview, gjr gjr1)
    {
        focusedparticipantview.j = gjr1;
        return gjr1;
    }

    public static void a(FocusedParticipantView focusedparticipantview)
    {
        focusedparticipantview.h();
    }

    public static gjr b(FocusedParticipantView focusedparticipantview)
    {
        return focusedparticipantview.j;
    }

    private void b(int i1)
    {
        if (c != i1)
        {
            int j1 = c;
            ebw.c("Babel_calls", (new StringBuilder(67)).append("FocusedParticipantView: switch from mode=").append(j1).append(" to ").append(i1).toString());
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
            l = new gjd(f.f(), m);
            l.a(this);
            gjd gjd1 = l;
            boolean flag;
            if (!f.v())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gjd1.c(flag);
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
            bitmap = anv.j();
        } else
        {
            bitmap = anv.h();
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
        for (Iterator iterator = hgx.c(getContext(), boa).iterator(); iterator.hasNext(); iterator.next()) { }
    }

    private void h()
    {
        long l2 = 0L;
        if (!f.v() && (j == null || !j.l())) goto _L2; else goto _L1
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
        bpd bpd1;
        bry bry1;
        Iterator iterator;
        String s1;
        if (j != null && k != null)
        {
            p.setBase(j.i());
            p.start();
            v = true;
        }
_L7:
        bpd1 = f.t();
        if (!(k instanceof bsb))
        {
            break MISSING_BLOCK_LABEL_532;
        }
        bry1 = ((bsb)k).l();
        if (bry1 == null || bpd1 == null)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        iterator = bpd1.W().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_532;
            }
            obj = (bpk)iterator.next();
            s1 = ebz.g(bry1.b());
        } while (s1 == null || !s1.equals(((bpk) (obj)).a()));
_L8:
        i();
        int i1;
        if (obj != null && ((bpk) (obj)).b() != null)
        {
            r.setText(getResources().getString(l.bw, new Object[] {
                ((bpk) (obj)).b()
            }));
            r.setText(getResources().getString(l.bx, new Object[] {
                ((bpk) (obj)).b()
            }));
            r.setVisibility(0);
            if (obj instanceof bpm)
            {
                obj = (bpm)obj;
                if (l1 < (long)((bpm) (obj)).d())
                {
                    if (((bpm) (obj)).c())
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
        if (bpd1 != null && bpd1.l().ab())
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

    public void a(bot bot)
    {
        d.a(e);
        f.a(a);
        if (f.f() != null)
        {
            e();
        }
    }

    void a(bqf bqf1, ParticipantTrayView participanttrayview)
    {
        g = participanttrayview;
        h = bqf1;
        setOnClickListener(new boc(this, bqf1));
        if (b)
        {
            setOnLongClickListener(new bod(this));
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
        brk brk1 = k;
        j = f.q();
        if (j == null)
        {
            k = g.d();
        } else
        {
            k = g.a(j.a());
        }
        if (f.v() && (k instanceof bse))
        {
            j = null;
            k = null;
        }
        if (k != brk1)
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
        Iterator iterator = hgx.c(getContext(), bsi).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s3 = ((bsi)iterator.next()).a();
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

    public void i_()
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
        hik hik = ebw.f;
    }
}
