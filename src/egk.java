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

public class egk extends FrameLayout
    implements android.view.View.OnClickListener
{

    egl a;
    private TextView b;
    private AvatarView c;
    private Button d;
    private String e;
    private cgd f;

    public egk(Context context)
    {
        this(context, (byte)0);
    }

    private egk(Context context, byte byte0)
    {
        super(context, null);
        context = LayoutInflater.from(context).inflate(g.fh, this);
        d = (Button)context.findViewById(h.gw);
        d.setOnClickListener(this);
        b = (TextView)context.findViewById(h.dH);
        c = (AvatarView)context.findViewById(h.D);
    }

    public cgd a()
    {
        return f;
    }

    public void a(cgd cgd)
    {
        f = cgd;
    }

    public void a(egl egl1)
    {
        a = egl1;
    }

    public void a(String s)
    {
        e = s;
        b.setText(s);
    }

    public void a(String s, String s1, aoa aoa)
    {
        c.a(s, s1, aoa);
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
