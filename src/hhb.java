// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class hhb extends ContextWrapper
    implements hha
{

    private final hgx a;
    private LayoutInflater b;

    public hhb()
    {
        super(null);
        a = new hgx();
    }

    public hhb(Context context)
    {
        this(context, hgx.b(context));
    }

    public hhb(Context context, hgx hgx1)
    {
        super(context);
        if (context == null)
        {
            throw new IllegalArgumentException("Cannot construct BinderContextWrapper with null Context");
        } else
        {
            a = new hgx(this, hgx1);
            return;
        }
    }

    public void a(Context context)
    {
        attachBaseContext(context);
        a.a(context);
    }

    public void a(hgx hgx1)
    {
        a.a(hgx1);
    }

    public hgx getBinder()
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
