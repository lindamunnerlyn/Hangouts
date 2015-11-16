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

public final class bzq extends FrameLayout
    implements bzg
{

    bzh a;
    String b;
    boolean c;
    private long d;
    private final Runnable e;

    public bzq(Context context)
    {
        this(context, (byte)0);
    }

    private bzq(Context context, byte byte0)
    {
        this(context, ((AttributeSet) (null)));
    }

    private bzq(Context context, AttributeSet attributeset)
    {
        super(context, null, 0);
        e = new bzr(this);
        inflate(getContext(), g.gB, this);
        setContentDescription(getResources().getString(g.mX));
        setOnClickListener(new bzs(this));
    }

    private void c()
    {
        Handler handler = getHandler();
        if (handler != null && !c)
        {
            c = true;
            int i = g.a(g.nU, "babel_location_request_suggestion_duration", 45);
            handler.postDelayed(e, TimeUnit.SECONDS.toMillis(i));
        }
    }

    public long a()
    {
        return d;
    }

    public void a(long l, String s)
    {
        d = l;
        b = s;
        c();
    }

    public void a(bzh bzh)
    {
        a = bzh;
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
