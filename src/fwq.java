// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;

public final class fwq
    implements android.os.Parcelable.Creator
{

    public fwq()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
        CapabilityInfoParcelable capabilityinfoparcelable = null;
        int i = 0;
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
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    capabilityinfoparcelable = (CapabilityInfoParcelable)g.a(parcel, l, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCapabilityResponse(i, j, capabilityinfoparcelable);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GetCapabilityResponse[i];
    }
}
