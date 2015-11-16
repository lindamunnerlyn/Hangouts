// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

public class byh
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new byi();
    public final String a;
    public final LatLng b;
    public final CharSequence c;
    public final CharSequence d;

    byh(Parcel parcel)
    {
        a = parcel.readString();
        b = (LatLng)parcel.readParcelable(com/google/android/gms/maps/model/LatLng.getClassLoader());
        c = parcel.readString();
        d = parcel.readString();
    }

    private byh(String s, LatLng latlng, CharSequence charsequence, CharSequence charsequence1)
    {
        a = s;
        b = latlng;
        c = charsequence;
        d = charsequence1;
    }

    public static byh a(ffo ffo1)
    {
        return new byh(ffo1.a(), ffo1.d(), ffo1.b(), ffo1.c());
    }

    public ffo a()
    {
        return new byj(this);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, 0);
        parcel.writeString(c.toString());
        parcel.writeString(d.toString());
    }

}
