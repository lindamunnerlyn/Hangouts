// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.location.places.internal.PlaceImpl;
import com.google.android.gms.location.places.internal.PlaceLocalization;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class fil
    implements android.os.Parcelable.Creator
{

    public fil()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k = g.a(parcel);
        int j = 0;
        String s5 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        android.os.Bundle bundle = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        LatLng latlng = null;
        float f1 = 0.0F;
        LatLngBounds latlngbounds = null;
        String s = null;
        Uri uri = null;
        boolean flag1 = false;
        float f = 0.0F;
        int i = 0;
        long l1 = 0L;
        boolean flag = false;
        PlaceLocalization placelocalization = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = g.i(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = g.k(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)g.a(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)g.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = g.g(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)g.a(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = g.i(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)g.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = g.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = g.g(parcel, l);
                    break;

                case 11: // '\013'
                    i = g.e(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = g.f(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = g.n(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = g.i(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = g.i(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = g.o(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = g.i(parcel, l);
                    break;

                case 1000: 
                    j = g.e(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = g.i(parcel, l);
                    break;

                case 18: // '\022'
                    flag = g.c(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = g.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlaceImpl(j, s5, arraylist2, arraylist1, bundle, s4, s3, s2, s1, arraylist, latlng, f1, latlngbounds, s, uri, flag1, f, i, l1, flag, placelocalization);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new PlaceImpl[i];
    }
}
