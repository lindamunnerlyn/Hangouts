// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class gyz extends FrameLayout
{

    private int a;
    private gms b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private AvatarView g;
    private boolean h;

    public gyz(Context context)
    {
        super(context);
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(g.tg, this, true);
        c = findViewById(g.tc);
        d = findViewById(g.tf);
        e = (TextView)findViewById(g.te);
        f = (TextView)findViewById(g.td);
        g = (AvatarView)findViewById(g.tb);
        b = (gms)hgx.a(getContext(), gms);
    }

    public void a(int i)
    {
        a = i;
        if (b.c(a))
        {
            Object obj = b.a(a);
            c.setVisibility(0);
            String s;
            String s1;
            String s2;
            if (h)
            {
                d.setVisibility(0);
            } else
            {
                d.setVisibility(4);
            }
            s = ((gmu) (obj)).b("display_name");
            s1 = ((gmu) (obj)).b("account_name");
            s2 = ((gmu) (obj)).b("gaia_id");
            obj = ((gmu) (obj)).b("profile_photo_url");
            if (TextUtils.isEmpty(s))
            {
                e.setText(s1);
                f.setVisibility(8);
            } else
            {
                e.setText(s);
                f.setText(s1);
                f.setVisibility(0);
            }
            g.a(s2, ((String) (obj)));
            return;
        } else
        {
            c.setVisibility(8);
            return;
        }
    }
}
