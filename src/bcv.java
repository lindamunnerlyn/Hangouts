// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.hangouts.views.FixedAspectRatioImageView;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class bcv extends eib
{

    String a;
    String b;
    private eic g;
    private MessageListItemView h;

    public bcv(Context context, int i, boolean flag, String s, String s1, int j, int k, 
            String s2, String s3, MessageListItemView messagelistitemview, eic eic)
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
        g = eic;
        h = messagelistitemview;
        l = (int)getContext().getResources().getDimension(g.lj);
        e.setMaxWidth(l);
        e.setMaxHeight(l);
        if (j > 0 && k > 0)
        {
            e.a(j, k);
        } else
        {
            e.a(l, l);
        }
        setOnClickListener(new bcw(this));
        setContentDescription(bdr.b(getContext().getResources(), s3));
        s = (new edq(a, null)).a(getContext().getResources().getInteger(g.lm));
        s.b(s3);
        d = new arr(i, s, context, this, null);
        if (((dpn)hlp.a(getContext(), dpn)).a(d, f))
        {
            d = null;
            return;
        } else
        {
            e();
            return;
        }
    }

    static MessageListItemView a(bcv bcv1)
    {
        return bcv1.h;
    }

    static eic b(bcv bcv1)
    {
        return bcv1.g;
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
