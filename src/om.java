// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class om extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new on();
    public int a;
    public int b;
    public int c;

    public om(Parcel parcel)
    {
        super(parcel);
        a = 0;
        b = 0;
        c = 0;
        a = parcel.readInt();
    }

    public om(Parcelable parcelable)
    {
        super(parcelable);
        a = 0;
        b = 0;
        c = 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(a);
    }

}
