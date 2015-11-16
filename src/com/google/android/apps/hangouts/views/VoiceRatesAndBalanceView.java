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
import aoa;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dhy;
import eey;
import ejw;
import g;
import gdv;
import h;
import l;

public class VoiceRatesAndBalanceView extends LinearLayout
    implements android.view.View.OnClickListener
{

    public View a;
    public TextView b;
    public TextView c;
    public boolean d;
    public final Object e;
    public Pair f;
    public int g;
    private TextView h;
    private View i;
    private View j;
    private final dhy k;

    public VoiceRatesAndBalanceView(Context context)
    {
        this(context, null);
    }

    public VoiceRatesAndBalanceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new Object();
        g = -1;
        k = new ejw(this);
        context = LayoutInflater.from(context).inflate(g.hg, this, true);
        a = context.findViewById(h.gc);
        a.setOnClickListener(this);
        b = (TextView)context.findViewById(h.ez);
        c = (TextView)context.findViewById(h.eB);
        h = (TextView)context.findViewById(h.O);
        i = context.findViewById(h.N);
        j = context.findViewById(h.M);
        d = true;
    }

    public static void a(Context context)
    {
        context.startActivity(g.q(g.a(context, "babel_google_voice_add_balance_url", "https://www.google.com/voice/m/billing")));
    }

    private static boolean a(aoa aoa1)
    {
        return !aoa1.Y();
    }

    private void d()
    {
        if (f == null && g == -1)
        {
            RealTimeChatService.b(k);
        }
    }

    public void a()
    {
        gdv.a("Expected condition to be true", Thread.holdsLock(e));
        if (f != null)
        {
            f = null;
            d();
        }
    }

    public void a(String s, aoa aoa1)
    {
        if (d && !TextUtils.isEmpty(s) && aoa1 != null && a(aoa1))
        {
            synchronized (e)
            {
                if (g == -1)
                {
                    RealTimeChatService.a(k);
                    g = RealTimeChatService.e(aoa1.h());
                }
            }
        }
        obj = eey.g(s);
        if (obj != null)
        {
            if (aoa1 != null)
            {
                synchronized (e)
                {
                    RealTimeChatService.a(k);
                    f = new Pair(Integer.valueOf(RealTimeChatService.c(aoa1.h(), ((String) (obj)))), obj);
                }
            }
            return;
        }
        break MISSING_BLOCK_LABEL_123;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        aoa1;
        s;
        JVM INSTR monitorexit ;
        throw aoa1;
        synchronized (e)
        {
            a();
        }
        setVisibility(8);
        return;
        aoa1;
        s;
        JVM INSTR monitorexit ;
        throw aoa1;
    }

    public boolean a(aoa aoa1, StringBuilder stringbuilder)
    {
        boolean flag = false;
        byte byte0 = 8;
        if (a(aoa1))
        {
            aoa1 = aoa1.W();
            h.setText(aoa1);
            if (stringbuilder != null)
            {
                String s = String.valueOf(getResources().getString(l.bg));
                stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(aoa1).length())).append(", ").append(s).append(aoa1).toString());
            }
            byte0 = 0;
        }
        h.setVisibility(byte0);
        i.setVisibility(byte0);
        j.setVisibility(byte0);
        if (byte0 == 0)
        {
            flag = true;
        }
        return flag;
    }

    public void b()
    {
        gdv.a("Expected condition to be true", Thread.holdsLock(e));
        if (g != -1)
        {
            g = -1;
            d();
        }
    }

    public void c()
    {
        d = true;
    }

    public void onClick(View view)
    {
        a(getContext());
    }

    public void onDetachedFromWindow()
    {
        synchronized (e)
        {
            a();
            b();
        }
        super.onDetachedFromWindow();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
