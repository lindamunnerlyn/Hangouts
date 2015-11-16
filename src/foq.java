// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class foq
    implements android.os.Parcelable.Creator
{

    public foq()
    {
    }

    public static StreetViewPanoramaOptions a(Parcel parcel)
    {
        byte byte0 = 0;
        int j = g.a(parcel);
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        Integer integer = null;
        LatLng latlng = null;
        String s = null;
        StreetViewPanoramaCamera streetviewpanoramacamera = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)g.a(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)g.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    k = g.a(parcel, k);
                    if (k == 0)
                    {
                        integer = null;
                    } else
                    {
                        if (k != 4)
                        {
                            throw new af((new StringBuilder("Expected size 4")).append(" got ").append(k).append(" (0x").append(Integer.toHexString(k)).append(")").toString(), parcel);
                        }
                        integer = Integer.valueOf(parcel.readInt());
                    }
                    break;

                case 6: // '\006'
                    byte4 = g.d(parcel, k);
                    break;

                case 7: // '\007'
                    byte3 = g.d(parcel, k);
                    break;

                case 8: // '\b'
                    byte2 = g.d(parcel, k);
                    break;

                case 9: // '\t'
                    byte1 = g.d(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = g.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }
}
