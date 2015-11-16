// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

final class hji extends hjs
{

    public static final android.os.Parcelable.Creator CREATOR = new hjj();
    boolean a;
    Bundle b;

    public hji(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        a = flag;
        b = parcel.readBundle();
    }

    public hji(Parcelable parcelable)
    {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeBundle(b);
    }

}
