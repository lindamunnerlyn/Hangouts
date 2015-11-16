// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

final class cfh
{

    TextView a;
    TextView b;
    ViewGroup c;
    AvatarView d;
    ImageView e;

    public cfh(View view)
    {
        a = (TextView)view.findViewById(l.up);
        b = (TextView)view.findViewById(l.uq);
        c = (ViewGroup)view.findViewById(l.ur);
        d = (AvatarView)view.findViewById(l.um);
        e = (ImageView)view.findViewById(l.uo);
    }
}
