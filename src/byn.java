// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;

public final class byn extends FrameLayout
    implements byd
{

    private bye a;
    private long b;
    private String c;
    private final Runnable d;
    private boolean e;

    public byn(Context context)
    {
        this(context, (byte)0);
    }

    private byn(Context context, byte byte0)
    {
        this(context, ((AttributeSet) (null)));
    }

    private byn(Context context, AttributeSet attributeset)
    {
        super(context, null, 0);
        d = new byo(this);
        inflate(getContext(), g.gG, this);
        setContentDescription(getResources().getString(g.mW));
        setOnClickListener(new byp(this));
    }

    static boolean a(byn byn1)
    {
        byn1.e = false;
        return false;
    }

    static String b(byn byn1)
    {
        return byn1.c;
    }

    static bye c(byn byn1)
    {
        return byn1.a;
    }

    private void c()
    {
        Handler handler = getHandler();
        if (handler != null && !e)
        {
            e = true;
            int i = g.a(g.nS, "babel_location_request_suggestion_duration", 45);
            handler.postDelayed(d, TimeUnit.SECONDS.toMillis(i));
        }
    }

    public long a()
    {
        return b;
    }

    public void a(long l, String s)
    {
        b = l;
        c = s;
        c();
    }

    public void a(bye bye)
    {
        a = bye;
    }

    public View b()
    {
        return this;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c();
    }
}
