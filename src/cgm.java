// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

final class cgm
{

    TextView a;
    TextView b;
    ViewGroup c;
    AvatarView d;
    ImageView e;

    public cgm(View view)
    {
        a = (TextView)view.findViewById(l.tG);
        b = (TextView)view.findViewById(l.tH);
        c = (ViewGroup)view.findViewById(l.tI);
        d = (AvatarView)view.findViewById(l.tD);
        e = (ImageView)view.findViewById(l.tF);
    }
}
