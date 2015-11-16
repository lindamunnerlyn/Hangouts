// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import ani;
import ebw;
import ecw;
import ecx;
import ecy;
import ecz;
import edd;
import efo;
import g;
import h;
import l;

public class AudioAttachmentView extends LinearLayout
    implements android.widget.SeekBar.OnSeekBarChangeListener, efo
{

    private static final boolean a = false;
    private long b;
    private TextView c;
    private TextView d;
    private String e;
    private ImageView f;
    private ImageView g;
    private SeekBar h;
    private boolean i;
    private int j;
    private edd k;
    private ecz l;

    public AudioAttachmentView(Context context)
    {
        this(context, null);
    }

    public AudioAttachmentView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AudioAttachmentView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = (AccessibilityManager)getContext().getSystemService("accessibility");
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21 || !context.isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    private void a(TextView textview, int i1)
    {
        StringBuilder stringbuilder = new StringBuilder(DateUtils.formatElapsedTime(i1 / 1000));
        i1 = l.h();
        if (i1 > 0)
        {
            stringbuilder.append(" / ");
            stringbuilder.append(DateUtils.formatElapsedTime(i1 / 1000));
        }
        textview.setText(stringbuilder.toString());
    }

    public static void a(AudioAttachmentView audioattachmentview)
    {
        audioattachmentview.j();
    }

    public static boolean b(AudioAttachmentView audioattachmentview)
    {
        return audioattachmentview.i;
    }

    public static edd c(AudioAttachmentView audioattachmentview)
    {
        return audioattachmentview.k;
    }

    public static ecz d(AudioAttachmentView audioattachmentview)
    {
        return audioattachmentview.l;
    }

    public static boolean g()
    {
        return a;
    }

    private void h()
    {
        f.setImageResource(com.google.android.apps.hangouts.R.drawable.cs);
        f.setContentDescription(getResources().getString(l.ih));
    }

    private void i()
    {
        f.setImageResource(com.google.android.apps.hangouts.R.drawable.cp);
        f.setContentDescription(getResources().getString(l.hV));
    }

    private void j()
    {
        int i1 = l.b();
        if ("speaker".equals(l.c()))
        {
            g.setImageResource(com.google.android.apps.hangouts.R.drawable.cv);
            g.setContentDescription(getResources().getString(l.kR));
        } else
        {
            g.setImageResource(com.google.android.apps.hangouts.R.drawable.ck);
            g.setContentDescription(getResources().getString(l.kQ));
        }
        if (l.f() || i1 == 0 || i1 == 1)
        {
            g.setVisibility(4);
        } else
        {
            g.setVisibility(0);
        }
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
        case 1: // '\001'
            h();
            h.setProgress(0);
            k();
            return;

        case 2: // '\002'
        case 3: // '\003'
            i();
            h.setProgress(0);
            d.setText(getResources().getString(l.y));
            return;

        case 4: // '\004'
            i();
            e();
            return;

        case 5: // '\005'
            h();
            break;
        }
        e();
    }

    private void k()
    {
        if (b != 0L)
        {
            StringBuilder stringbuilder = new StringBuilder(g.a(b, false));
            StringBuilder stringbuilder1 = new StringBuilder(g.a(b, true));
            d.setText(stringbuilder.toString());
            e = stringbuilder1.toString();
            return;
        } else
        {
            d.setText("");
            e = "";
            return;
        }
    }

    private void l()
    {
        c.setTextColor(j);
        d.setTextColor(j);
        f.setColorFilter(j);
        g.setColorFilter(j);
        a(com.google.android.apps.hangouts.R.drawable.cE, com.google.android.apps.hangouts.R.drawable.cD);
    }

    public void a(int i1, int j1)
    {
        Object obj = getResources();
        Drawable drawable = ((Resources) (obj)).getDrawable(i1);
        drawable.setColorFilter(j, android.graphics.PorterDuff.Mode.SRC_ATOP);
        h.setThumb(drawable);
        obj = ((Resources) (obj)).getDrawable(j1);
        ((Drawable) (obj)).setColorFilter(j, android.graphics.PorterDuff.Mode.SRC_ATOP);
        h.setProgressDrawable(((Drawable) (obj)));
    }

    public void a(ani ani, String s, long l1, String s1, String s2, String s3, 
            String s4, long l2, int i1)
    {
        b = l2;
        setLongClickable(true);
        a(((edd) (new ecy(this, ani, s1, s3))));
        ani = ecz.a;
        if (ani == null || !ani.a().equals(s2)) goto _L2; else goto _L1
_L1:
        l = ani;
        l.a(s, l1);
_L4:
        l.a(this);
        l.a(k);
        c.setText(s4);
        k();
        j = i1;
        l();
        j();
        return;
_L2:
        if (l != null)
        {
            if (!l.a().equals(s2))
            {
                l.a(null);
                l = new ecz(this, s2, s, l1);
            }
        } else
        {
            l = new ecz(this, s2, s, l1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(edd edd)
    {
        k = edd;
    }

    public void a(String s)
    {
    }

    public void a(String s, long l1)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        if (l != null)
        {
            l.a(s, l1);
            return;
        } else
        {
            ebw.f("Babel", "updateUrl: audioPlaybackController is null");
            return;
        }
    }

    public void b()
    {
        if (l != null)
        {
            l.a(null);
            l = null;
        }
    }

    public void c()
    {
    }

    public void d()
    {
    }

    void e()
    {
        int i1 = l.i();
        int j1 = l.h();
        if (l.b() == 4 && i1 == 0)
        {
            return;
        }
        a(d, i1);
        if (j1 != 0)
        {
            h.setProgress((i1 * 100) / j1);
            return;
        } else
        {
            h.setProgress(0);
            return;
        }
    }

    public String f()
    {
        return e;
    }

    public void f_()
    {
    }

    public void onFinishInflate()
    {
        c = (TextView)findViewById(h.B);
        d = (TextView)findViewById(h.A);
        f = (ImageView)findViewById(h.eE);
        g = (ImageView)findViewById(h.ga);
        h = (SeekBar)findViewById(h.eD);
        l();
        if (!i)
        {
            findViewById(h.eD).setVisibility(4);
        }
        f.setOnClickListener(new ecw(this));
        g.setOnClickListener(new ecx(this));
        h.setOnSeekBarChangeListener(this);
    }

    public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
    {
label0:
        {
            if (flag)
            {
                if (l == null)
                {
                    break label0;
                }
                i1 = (l.h() * i1) / 100;
                a(d, i1);
            }
            return;
        }
        ebw.f("Babel", "onProgressChanged: audioPlaybackController is null");
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        if (l != null)
        {
            l.l();
            return;
        } else
        {
            ebw.f("Babel", "onStartTrackingTouch: audioPlaybackController is null");
            return;
        }
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (l != null)
        {
            ecz ecz1 = l;
            int i1 = (seekbar.getProgress() * l.h()) / 100;
            if (a)
            {
                ecz1.a("sendSeek", (new StringBuilder(27)).append("new position is ").append(i1).toString());
            }
            int j1 = ecz1.b();
            if (j1 == 4 || j1 == 5)
            {
                seekbar = ecz1.a(4);
                seekbar.putExtra("position_in_milliseconds", i1);
                ecz1.c.startService(seekbar);
            }
            l.k();
            return;
        } else
        {
            ebw.f("Babel", "onStopTrackingTouch: audioPlaybackController is null");
            return;
        }
    }

    static 
    {
        hik hik = ebw.a;
    }
}
