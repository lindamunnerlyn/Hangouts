// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fxb;
import g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            NodeParcelable

public class GetLocalNodeResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fxb();
    public final int a;
    public final int b;
    public final NodeParcelable c;

    public GetLocalNodeResponse(int i, int j, NodeParcelable nodeparcelable)
    {
        a = i;
        b = j;
        c = nodeparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.b(parcel, 2, b);
        g.a(parcel, 3, c, i);
        g.q(parcel, j);
    }

}
