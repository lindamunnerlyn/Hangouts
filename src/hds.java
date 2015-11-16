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

public final class hds extends FrameLayout
{

    private int a;
    private gqz b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private AvatarView g;
    private boolean h;

    public hds(Context context)
    {
        super(context);
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(g.tH, this, true);
        c = findViewById(g.tD);
        d = findViewById(g.tG);
        e = (TextView)findViewById(g.tF);
        f = (TextView)findViewById(g.tE);
        g = (AvatarView)findViewById(g.tC);
        b = (gqz)hlp.a(getContext(), gqz);
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
            s = ((grb) (obj)).b("display_name");
            s1 = ((grb) (obj)).b("account_name");
            s2 = ((grb) (obj)).b("gaia_id");
            obj = ((grb) (obj)).b("profile_photo_url");
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
