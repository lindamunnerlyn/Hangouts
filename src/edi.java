// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

public class edi extends FrameLayout
    implements android.view.View.OnClickListener
{

    edj a;
    private TextView b;
    private AvatarView c;
    private Button d;
    private String e;
    private cey f;

    private edi(Context context)
    {
        this(context, (byte)0);
    }

    private edi(Context context, byte byte0)
    {
        super(context, null);
        context = LayoutInflater.from(context).inflate(g.fj, this);
        d = (Button)context.findViewById(h.gO);
        d.setOnClickListener(this);
        b = (TextView)context.findViewById(h.dQ);
        c = (AvatarView)context.findViewById(h.E);
    }

    public static edi a(Context context)
    {
        return new edi(context);
    }

    public cey a()
    {
        return f;
    }

    public void a(cey cey)
    {
        f = cey;
    }

    public void a(edj edj1)
    {
        a = edj1;
    }

    public void a(String s)
    {
        e = s;
        b.setText(s);
    }

    public void a(String s, String s1, ani ani)
    {
        c.a(s, s1, ani);
    }

    public String b()
    {
        return e;
    }

    public void onClick(View view)
    {
        if (a != null && view == d)
        {
            a.a(this);
        }
    }
}