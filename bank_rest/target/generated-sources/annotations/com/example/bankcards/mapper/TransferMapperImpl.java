package com.example.bankcards.mapper;

import com.example.bankcards.dto.TransferDto.TransferCreateRequest;
import com.example.bankcards.dto.TransferDto.TransferDto;
import com.example.bankcards.dto.TransferDto.TransferResponse;
import com.example.bankcards.entity.Transfer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T11:57:42+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class TransferMapperImpl implements TransferMapper {

    @Override
    public Transfer transferRequestToTransfer(TransferCreateRequest transferCreateRequest) {
        if ( transferCreateRequest == null ) {
            return null;
        }

        Transfer transfer = new Transfer();

        transfer.setAmount( transferCreateRequest.getAmount() );
        transfer.setFromCardId( transferCreateRequest.getFromCardId() );
        transfer.setToCardId( transferCreateRequest.getToCardId() );
        transfer.setDescription( transferCreateRequest.getDescription() );
        transfer.setTime( transferCreateRequest.getTime() );

        return transfer;
    }

    @Override
    public TransferDto transferToTransferDto(Transfer transfer) {
        if ( transfer == null ) {
            return null;
        }

        TransferDto transferDto = new TransferDto();

        transferDto.setTransferId( transfer.getTransferId() );
        transferDto.setToCardId( transfer.getToCardId() );
        transferDto.setFromCardId( transfer.getFromCardId() );
        transferDto.setAmount( transfer.getAmount() );
        transferDto.setDescription( transfer.getDescription() );
        transferDto.setTime( transfer.getTime() );

        return transferDto;
    }

    @Override
    public TransferResponse transferToTransferResponse(Transfer transfer) {
        if ( transfer == null ) {
            return null;
        }

        TransferResponse transferResponse = new TransferResponse();

        transferResponse.setToCardId( transfer.getToCardId() );
        transferResponse.setFromCardId( transfer.getFromCardId() );
        transferResponse.setAmount( transfer.getAmount() );
        transferResponse.setDescription( transfer.getDescription() );
        transferResponse.setTime( transfer.getTime() );

        return transferResponse;
    }
}
