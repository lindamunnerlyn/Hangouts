// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cay
    implements fni
{

    final NavigationDrawerFragment a;

    public cay(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public fnh a(View view)
    {
        cbb cbb1 = new cbb();
        cbb1.a = view;
        cbb1.e = (ImageView)view.findViewById(h.E);
        cbb1.d = (TextView)view.findViewById(h.n);
        cbb1.b = (ImageView)view.findViewById(h.fV);
        cbb1.c = (ImageView)view.findViewById(h.I);
        return cbb1;
    }
}
