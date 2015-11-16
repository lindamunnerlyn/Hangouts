// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class hlt extends ContextWrapper
    implements hls
{

    private final hlp a;
    private LayoutInflater b;

    public hlt()
    {
        super(null);
        a = new hlp();
    }

    public hlt(Context context)
    {
        this(context, hlp.b(context));
    }

    public hlt(Context context, hlp hlp1)
    {
        super(context);
        if (context == null)
        {
            throw new IllegalArgumentException("Cannot construct BinderContextWrapper with null Context");
        } else
        {
            a = new hlp(this, hlp1);
            return;
        }
    }

    public void a(Context context)
    {
        attachBaseContext(context);
        a.a(context);
    }

    public void a(hlp hlp1)
    {
        a.a(hlp1);
    }

    public hlp getBinder()
    {
        return a;
    }

    public Object getSystemService(String s)
    {
        if (s.equals("layout_inflater"))
        {
            if (b == null)
            {
                b = ((LayoutInflater)super.getSystemService(s)).cloneInContext(this);
            }
            return b;
        } else
        {
            return super.getSystemService(s);
        }
    }
}
