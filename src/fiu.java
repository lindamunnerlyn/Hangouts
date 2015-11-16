// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

public class fiu extends FrameLayout
{

    public final fiw a;

    public fiu(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        a = new fiw(this, context, googlemapoptions);
        setClickable(true);
    }

    public void a(fiy fiy)
    {
        g.y("getMapAsync() must be called on the main thread");
        a.a(fiy);
    }
}
