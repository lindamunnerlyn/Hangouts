// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.util.TypedValue;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantOverlays;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;

public abstract class brk extends LinearLayout
    implements android.view.TextureView.SurfaceTextureListener, aqb, bos
{

    public gjr a;
    public final bof b = bof.a();
    public final bnd c = bnd.a();
    public bot d;
    public final bqf e;
    public final ParticipantTrayView f;
    public final FocusedParticipantView g;
    public int h;
    public final ImageButton i;
    public Bitmap j;
    private final ViewGroup k;
    private final ImageView l;
    private final TextureView m;
    private final TextView n;
    private final RemoteParticipantPopupMenu o;
    private final ParticipantOverlays p;
    private final bsj q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private apw x;
    private Bitmap y;
    private gju z;

    brk(bqf bqf1, gjr gjr1, ParticipantTrayView participanttrayview, FocusedParticipantView focusedparticipantview)
    {
        super(participanttrayview.getContext(), null);
        h = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        gbh.b(gjr1);
        e = bqf1;
        a = gjr1;
        f = participanttrayview;
        g = focusedparticipantview;
        inflate(getContext(), g.gf, this);
        k = (ViewGroup)findViewById(h.cr);
        l = (ImageView)findViewById(h.ct);
        m = (TextureView)findViewById(h.cv);
        m.setSurfaceTextureListener(this);
        i = (ImageButton)findViewById(h.cq);
        i.setOnClickListener(new brl(this));
        i.setOnLongClickListener(new brm(this));
        o = (RemoteParticipantPopupMenu)findViewById(h.eG);
        n = (TextView)findViewById(h.cu);
        q = new bsj(getContext(), k);
        p = (ParticipantOverlays)findViewById(h.eu);
    }

    static void a(brk brk1)
    {
        if (!brk1.a.g())
        {
            brk1.f.e();
            brk1.o.setVisibility(0);
            RemoteParticipantPopupMenu remoteparticipantpopupmenu = brk1.o;
            brk1.getContext();
            remoteparticipantpopupmenu.a(brk1.d, brk1.a, brk1.c.t());
        }
    }

    private void l()
    {
        a(t);
        String s1;
        String s2;
        TextView textview;
        if (w != null)
        {
            s1 = w;
        } else
        {
            s1 = v;
        }
        textview = n;
        s2 = s1;
        if (a.l())
        {
            s2 = ebz.p(s1);
        }
        textview.setText(s2);
    }

    public void a(int i1)
    {
    }

    public void a(bot bot1)
    {
        d = bot1;
        i();
        f();
        g.b();
        p.a(a);
        p.setVisibility(0);
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(eab);
        if (flag)
        {
            j = ebh1.d();
            y = ean.a(j);
            l.setImageBitmap(j);
            g.a(a.a());
        }
    }

    protected abstract void a(gju gju1);

    void a(String s1)
    {
        v = s1;
        l();
    }

    protected void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            if (a.d())
            {
                i1 = l.tc;
            } else
            {
                i1 = l.tb;
            }
        } else
        if (a.d())
        {
            i1 = l._fldif;
        } else
        {
            i1 = l.ie;
        }
        i.setContentDescription(getResources().getString(i1, new Object[] {
            g()
        }));
    }

    protected int b(int i1)
    {
        return i1;
    }

    public void b()
    {
        if (x != null)
        {
            x.b();
            x = null;
        }
        if (o.a())
        {
            o.b();
        }
    }

    void b(String s1)
    {
        w = s1;
        l();
    }

    public gjr c()
    {
        return a;
    }

    protected void c(int i1)
    {
        gbh.a(i1, 1, 3);
        if (h != i1)
        {
            String s1 = String.valueOf(a.a());
            int j1 = h;
            ebw.a("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 56)).append("ParticipantView: switch ").append(s1).append(" from ").append(j1).append(" to ").append(i1).toString());
            h = i1;
        }
    }

    protected void c(String s1)
    {
        gbh.b(s1);
        ani ani1 = d.a();
        dmt dmt1 = (dmt)hgx.a(getContext(), dmt);
        if (x != null)
        {
            dmt1.b(x);
        }
        x = new apw((new eam(s1, ani1.a())).a(anv.e()).d(true), this, true, null);
        if (dmt1.a(x))
        {
            x = null;
        }
    }

    protected void d()
    {
        if (a.j())
        {
            c.a(null);
        } else
        {
            c.a(a.a());
        }
        e.h();
    }

    public void e()
    {
        if (o.a())
        {
            o.b();
            o.setVisibility(8);
        }
    }

    void f()
    {
        android.view.ViewGroup.LayoutParams layoutparams = k.getLayoutParams();
        Resources resources = i.getResources();
        Object obj = (WindowManager)getContext().getSystemService("window");
        Point point = new Point();
        ((WindowManager) (obj)).getDefaultDisplay().getSize(point);
        obj = new TypedValue();
        resources.getValue(g.eq, ((TypedValue) (obj)), true);
        float f1 = ((TypedValue) (obj)).getFloat();
        int i1 = resources.getDimensionPixelSize(g.ep);
        int j1 = resources.getDimensionPixelSize(g.er);
        int k1 = resources.getInteger(g.eW);
        layoutparams.height = Math.min(Math.min((int)(f1 * (float)(point.y - (i1 << 1))), (point.x - (i1 << 1)) / k1), j1);
        layoutparams.width = b(layoutparams.height);
        k.setLayoutParams(layoutparams);
        if (m.getSurfaceTexture() != null)
        {
            onSurfaceTextureSizeChanged(m.getSurfaceTexture(), layoutparams.width, layoutparams.height);
        }
    }

    String g()
    {
        return v;
    }

    boolean h()
    {
        return r;
    }

    public void i()
    {
        byte byte0 = 4;
        Object obj;
        int i1;
        if (a.e() || a.n())
        {
            c(1);
        } else
        if (!a.e() && !a.q())
        {
            c(2);
        } else
        {
            c(3);
        }
        s = a.k();
        t = a.j();
        u = a.n();
        l.setImageBitmap(j());
        if (s || t || u)
        {
            n.setVisibility(0);
            i.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.aB);
            m.setVisibility(4);
            obj = l;
            i1 = byte0;
        } else
        {
            n.setVisibility(4);
            i.setBackgroundResource(0);
            obj = m;
            ImageView imageview;
            if (h != 1)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            ((TextureView) (obj)).setVisibility(i1);
            imageview = l;
            obj = imageview;
            i1 = byte0;
            if (h != 3)
            {
                i1 = 0;
                obj = imageview;
            }
        }
        ((ImageView) (obj)).setVisibility(i1);
        if (u)
        {
            i.setImageResource(com.google.android.apps.hangouts.R.drawable.bw);
        } else
        if (t)
        {
            i.setImageResource(com.google.android.apps.hangouts.R.drawable.aC);
        } else
        {
            i.setImageResource(0);
        }
        a(t);
    }

    public void i_()
    {
        p.a();
        b();
    }

    Bitmap j()
    {
        if (j != null)
        {
            return j;
        }
        if (a.l())
        {
            return anv.k();
        } else
        {
            return anv.i();
        }
    }

    public Bitmap k()
    {
        if (y != null)
        {
            return y;
        }
        if (a.l())
        {
            return anv.j();
        } else
        {
            return anv.h();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        f();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        z = new gju(new Surface(surfacetexture), i1, j1, true);
        a(z);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        c.b(z);
        z.a().release();
        z = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        if (z != null)
        {
            z = new gju(z.a(), i1, j1, true);
        }
        a(z);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void onWindowVisibilityChanged(int i1)
    {
        if (i1 != 0)
        {
            e();
        }
    }
}
