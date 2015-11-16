// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

public class ffy extends FrameLayout
{

    public final fga a;

    public ffy(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        a = new fga(this, context, googlemapoptions);
        setClickable(true);
    }

    public void a(fgc fgc)
    {
        h.c("getMapAsync() must be called on the main thread");
        a.a(fgc);
    }
}
