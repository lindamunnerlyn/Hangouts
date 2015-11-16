// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.hangouts.views.FixedAspectRatioImageView;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class bcf extends eez
{

    String a;
    String b;
    private efa g;
    private MessageListItemView h;

    public bcf(Context context, int i, boolean flag, String s, String s1, int j, int k, 
            String s2, String s3, MessageListItemView messagelistitemview, efa efa)
    {
        super(context, null);
        int l;
        if (s.startsWith("file://"))
        {
            context = s.replace("file://", "");
        } else
        {
            context = null;
        }
        if (!s.startsWith("file://"))
        {
            s = s1;
        }
        a(s);
        b = s2;
        f = flag;
        g = efa;
        h = messagelistitemview;
        l = (int)getContext().getResources().getDimension(g.lr);
        e.setMaxWidth(l);
        e.setMaxHeight(l);
        if (j > 0 && k > 0)
        {
            e.a(j, k);
        } else
        {
            e.a(l, l);
        }
        setOnClickListener(new bcg(this));
        setContentDescription(bdb.b(getContext().getResources(), s3));
        s = (new eam(a, null)).a(getContext().getResources().getInteger(g.lu));
        s.b(s3);
        d = new ara(i, s, context, this, null);
        if (((dmt)hgx.a(getContext(), dmt)).a(d, f))
        {
            d = null;
            return;
        } else
        {
            e();
            return;
        }
    }

    static MessageListItemView a(bcf bcf1)
    {
        return bcf1.h;
    }

    static efa b(bcf bcf1)
    {
        return bcf1.g;
    }

    public void a(String s)
    {
        if (a == null || !a.startsWith("file://"))
        {
            a = s;
        }
    }

    protected boolean a()
    {
        return false;
    }
}
