// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class zn extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new zo();
    Parcelable a;

    zn(Parcel parcel)
    {
        super(parcel);
        a = parcel.readParcelable(zg.getClassLoader());
    }

    zn(Parcelable parcelable)
    {
        super(parcelable);
    }

    static void a(zn zn1, zn zn2)
    {
        zn1.a = zn2.a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, 0);
    }

}
