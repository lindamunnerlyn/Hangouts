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

public abstract class brt extends LinearLayout
    implements android.view.TextureView.SurfaceTextureListener, aqs, bpb
{

    public gmt a;
    public final boo b = boo.a();
    public final bnk c = bnk.a();
    public bpc d;
    public final bqo e;
    public final ParticipantTrayView f;
    public final FocusedParticipantView g;
    public int h;
    public final ImageButton i;
    final RemoteParticipantPopupMenu j;
    public Bitmap k;
    private final ViewGroup l;
    private final ImageView m;
    private final TextureView n;
    private final TextView o;
    private final ParticipantOverlays p;
    private final bss q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private aqn x;
    private Bitmap y;
    private gmw z;

    brt(bqo bqo1, gmt gmt1, ParticipantTrayView participanttrayview, FocusedParticipantView focusedparticipantview)
    {
        super(participanttrayview.getContext(), null);
        h = 0;
        r = false;
        s = false;
        t = false;
        u = false;
        gdv.b("Expected non-null", gmt1);
        e = bqo1;
        a = gmt1;
        f = participanttrayview;
        g = focusedparticipantview;
        inflate(getContext(), g.gb, this);
        l = (ViewGroup)findViewById(h.ch);
        m = (ImageView)findViewById(h.cj);
        n = (TextureView)findViewById(h.cl);
        n.setSurfaceTextureListener(this);
        i = (ImageButton)findViewById(h.cg);
        i.setOnClickListener(new bru(this));
        i.setOnLongClickListener(new brv(this));
        j = (RemoteParticipantPopupMenu)findViewById(h.eo);
        o = (TextView)findViewById(h.ck);
        q = new bss(getContext(), l);
        p = (ParticipantOverlays)findViewById(h.ed);
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
        textview = o;
        s2 = s1;
        if (a.l())
        {
            s2 = eey.p(s1);
        }
        textview.setText(s2);
    }

    public void a(int i1)
    {
    }

    public void a(bpc bpc1)
    {
        d = bpc1;
        i();
        f();
        g.b();
        p.a(a);
        p.setVisibility(0);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (flag)
        {
            k = eef1.d();
            y = edr.a(k);
            m.setImageBitmap(k);
            g.a(a.a());
        }
    }

    protected abstract void a(gmw gmw1);

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
                i1 = l.sv;
            } else
            {
                i1 = l.su;
            }
        } else
        if (a.d())
        {
            i1 = l.hz;
        } else
        {
            i1 = l.hy;
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
        if (j.a())
        {
            j.b();
        }
    }

    void b(String s1)
    {
        w = s1;
        l();
    }

    public gmt c()
    {
        return a;
    }

    protected void c(int i1)
    {
        gdv.a(i1, 1, 3);
        if (h != i1)
        {
            String s1 = String.valueOf(a.a());
            int j1 = h;
            eev.a("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 56)).append("ParticipantView: switch ").append(s1).append(" from ").append(j1).append(" to ").append(i1).toString());
            h = i1;
        }
    }

    protected void c(String s1)
    {
        gdv.b("Expected non-null", s1);
        aoa aoa1 = d.a();
        dpn dpn1 = (dpn)hlp.a(getContext(), dpn);
        if (x != null)
        {
            dpn1.b(x);
        }
        x = new aqn((new edq(s1, aoa1.a())).a(aon.e()).d(true), this, true, null);
        if (dpn1.a(x))
        {
            x = null;
        }
    }

    protected void d()
    {
        if (a.j())
        {
            c.b(null);
        } else
        {
            c.b(a.a());
        }
        e.h();
    }

    public void e()
    {
        if (j.a())
        {
            j.b();
            j.setVisibility(8);
        }
    }

    void f()
    {
        android.view.ViewGroup.LayoutParams layoutparams = l.getLayoutParams();
        Resources resources = i.getResources();
        Object obj = (WindowManager)getContext().getSystemService("window");
        Point point = new Point();
        ((WindowManager) (obj)).getDefaultDisplay().getSize(point);
        obj = new TypedValue();
        resources.getValue(g.eo, ((TypedValue) (obj)), true);
        float f1 = ((TypedValue) (obj)).getFloat();
        int i1 = resources.getDimensionPixelSize(g.en);
        int j1 = resources.getDimensionPixelSize(g.ep);
        int k1 = resources.getInteger(g.eU);
        layoutparams.height = Math.min(Math.min((int)(f1 * (float)(point.y - (i1 << 1))), (point.x - (i1 << 1)) / k1), j1);
        layoutparams.width = b(layoutparams.height);
        l.setLayoutParams(layoutparams);
        if (n.getSurfaceTexture() != null)
        {
            onSurfaceTextureSizeChanged(n.getSurfaceTexture(), layoutparams.width, layoutparams.height);
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
        m.setImageBitmap(j());
        if (s || t || u)
        {
            o.setVisibility(0);
            i.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.aA);
            n.setVisibility(4);
            obj = m;
            i1 = byte0;
        } else
        {
            o.setVisibility(4);
            i.setBackgroundResource(0);
            obj = n;
            ImageView imageview;
            if (h != 1)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            ((TextureView) (obj)).setVisibility(i1);
            imageview = m;
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
            i.setImageResource(com.google.android.apps.hangouts.R.drawable.bs);
        } else
        if (t)
        {
            i.setImageResource(com.google.android.apps.hangouts.R.drawable.aB);
        } else
        {
            i.setImageResource(0);
        }
        a(t);
    }

    Bitmap j()
    {
        if (k != null)
        {
            return k;
        }
        if (a.l())
        {
            return aon.k();
        } else
        {
            return aon.i();
        }
    }

    public void j_()
    {
        p.a();
        b();
    }

    public Bitmap k()
    {
        if (y != null)
        {
            return y;
        }
        if (a.l())
        {
            return aon.j();
        } else
        {
            return aon.h();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        f();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        z = new gmw(new Surface(surfacetexture), i1, j1, true);
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
            z = new gmw(z.a(), i1, j1, true);
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
