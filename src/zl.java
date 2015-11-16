// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class zl extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new zm();
    Parcelable a;

    zl(Parcel parcel)
    {
        super(parcel);
        a = parcel.readParcelable(ze.getClassLoader());
    }

    zl(Parcelable parcelable)
    {
        super(parcelable);
    }

    static void a(zl zl1, zl zl2)
    {
        zl1.a = zl2.a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, 0);
    }

}
