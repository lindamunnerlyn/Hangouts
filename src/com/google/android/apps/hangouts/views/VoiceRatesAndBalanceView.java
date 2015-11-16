// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ani;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dgp;
import ebz;
import egu;
import g;
import gbh;
import h;
import java.util.Locale;
import l;

public class VoiceRatesAndBalanceView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private View a;
    private TextView b;
    private TextView c;
    private TextView d;
    private View e;
    private View f;
    private boolean g;
    private final Object h;
    private Pair i;
    private int j;
    private final dgp k;

    public VoiceRatesAndBalanceView(Context context)
    {
        this(context, null);
    }

    public VoiceRatesAndBalanceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new Object();
        j = -1;
        k = new egu(this);
        context = LayoutInflater.from(context).inflate(g.ho, this, true);
        a = context.findViewById(h.gu);
        a.setOnClickListener(this);
        b = (TextView)context.findViewById(h.eR);
        c = (TextView)context.findViewById(h.eT);
        d = (TextView)context.findViewById(h.O);
        e = context.findViewById(h.N);
        f = context.findViewById(h.M);
        g = true;
    }

    public static Object a(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        return voiceratesandbalanceview.h;
    }

    public static void a(Context context)
    {
        context.startActivity(g.q(g.a(context, "babel_google_voice_add_balance_url", "https://www.google.com/voice/m/billing")));
    }

    public static void a(VoiceRatesAndBalanceView voiceratesandbalanceview, String s, boolean flag, String s1, ani ani1)
    {
        s = ebz.a(s);
        StringBuilder stringbuilder;
        int i1;
        if (s == null)
        {
            s = Locale.getDefault();
        } else
        {
            s = new Locale(Locale.getDefault().getLanguage(), s);
        }
        stringbuilder = new StringBuilder();
        s = voiceratesandbalanceview.getResources().getString(l.bq, new Object[] {
            s.getDisplayCountry()
        });
        voiceratesandbalanceview.b.setText(s);
        stringbuilder.append(s);
        if (flag)
        {
            i1 = voiceratesandbalanceview.getResources().getColor(g.di);
            s = voiceratesandbalanceview.getResources().getString(l.br);
            s1 = s;
        } else
        {
            i1 = voiceratesandbalanceview.getResources().getColor(g.dh);
            String s2 = voiceratesandbalanceview.getResources().getString(l.bw, new Object[] {
                s1
            });
            s = voiceratesandbalanceview.getResources().getString(l.bx, new Object[] {
                s1
            });
            s1 = s2;
        }
        voiceratesandbalanceview.c.setTextColor(i1);
        voiceratesandbalanceview.c.setText(s1);
        stringbuilder.append(s);
        if (voiceratesandbalanceview.a(ani1, stringbuilder))
        {
            voiceratesandbalanceview.a.setContentDescription(voiceratesandbalanceview.getResources().getString(l.dx, new Object[] {
                stringbuilder.toString()
            }));
        } else
        {
            voiceratesandbalanceview.a.setContentDescription(stringbuilder.toString());
        }
        voiceratesandbalanceview.setVisibility(0);
    }

    private static boolean a(ani ani1)
    {
        return !ani1.ab();
    }

    private boolean a(ani ani1, StringBuilder stringbuilder)
    {
        boolean flag = false;
        byte byte0 = 8;
        if (a(ani1))
        {
            ani1 = ani1.Z();
            d.setText(ani1);
            if (stringbuilder != null)
            {
                String s = String.valueOf(getResources().getString(l.bm));
                stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(ani1).length())).append(", ").append(s).append(ani1).toString());
            }
            byte0 = 0;
        }
        d.setVisibility(byte0);
        e.setVisibility(byte0);
        f.setVisibility(byte0);
        if (byte0 == 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean a(VoiceRatesAndBalanceView voiceratesandbalanceview, ani ani1)
    {
        return voiceratesandbalanceview.a(ani1, ((StringBuilder) (null)));
    }

    public static Pair b(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        return voiceratesandbalanceview.i;
    }

    private void b()
    {
        gbh.a(Thread.holdsLock(h));
        if (i != null)
        {
            i = null;
            d();
        }
    }

    private void c()
    {
        gbh.a(Thread.holdsLock(h));
        if (j != -1)
        {
            j = -1;
            d();
        }
    }

    public static void c(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        voiceratesandbalanceview.b();
    }

    public static int d(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        return voiceratesandbalanceview.j;
    }

    private void d()
    {
        if (i == null && j == -1)
        {
            RealTimeChatService.b(k);
        }
    }

    public static void e(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        voiceratesandbalanceview.c();
    }

    public static boolean f(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        voiceratesandbalanceview.g = false;
        return false;
    }

    public void a()
    {
        g = true;
    }

    public void a(String s, ani ani1)
    {
        if (g && !TextUtils.isEmpty(s) && ani1 != null && a(ani1))
        {
            synchronized (h)
            {
                if (j == -1)
                {
                    RealTimeChatService.a(k);
                    j = RealTimeChatService.e(ani1.h());
                }
            }
        }
        obj = ebz.g(s);
        if (obj != null)
        {
            if (ani1 != null)
            {
                synchronized (h)
                {
                    RealTimeChatService.a(k);
                    i = new Pair(Integer.valueOf(RealTimeChatService.c(ani1.h(), ((String) (obj)))), obj);
                }
            }
            return;
        }
        break MISSING_BLOCK_LABEL_123;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        ani1;
        s;
        JVM INSTR monitorexit ;
        throw ani1;
        synchronized (h)
        {
            b();
        }
        setVisibility(8);
        return;
        ani1;
        s;
        JVM INSTR monitorexit ;
        throw ani1;
    }

    public void onClick(View view)
    {
        a(getContext());
    }

    public void onDetachedFromWindow()
    {
        synchronized (h)
        {
            b();
            c();
        }
        super.onDetachedFromWindow();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
