// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class bd extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new be();
    String a;

    bd(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    bd(Parcelable parcelable)
    {
        super(parcelable);
    }

    public String toString()
    {
        return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
    }

}
