ALTER TABLE MMS_DOCUMENT_LINE  RENAME COLUMN  QTY  TO QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE  ADD QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE SET QTY = TRIM(QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE DROP COLUMN QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE  RENAME COLUMN  HANDLED_QTY  TO HANDLED_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE  ADD HANDLED_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE SET HANDLED_QTY = TRIM(HANDLED_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE DROP COLUMN HANDLED_QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE  RENAME COLUMN  UN_HANDLE_QTY  TO UN_HANDLE_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE  ADD UN_HANDLE_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE SET UN_HANDLE_QTY = TRIM(UN_HANDLE_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE DROP COLUMN UN_HANDLE_QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE  RENAME COLUMN  RESERVED_QTY  TO RESERVED_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE  ADD RESERVED_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE SET RESERVED_QTY = TRIM(RESERVED_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE DROP COLUMN RESERVED_QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE  RENAME COLUMN  UN_RESERVED_QTY  TO UN_RESERVED_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE  ADD UN_RESERVED_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE SET UN_RESERVED_QTY = TRIM(UN_RESERVED_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE DROP COLUMN UN_RESERVED_QTY_TEMP;


ALTER TABLE MMS_DOCUMENT_LINE_HIS  RENAME COLUMN  QTY  TO QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE_HIS  ADD QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE_HIS SET QTY = TRIM(QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE_HIS DROP COLUMN QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE_HIS  RENAME COLUMN  HANDLED_QTY  TO HANDLED_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE_HIS  ADD HANDLED_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE_HIS SET HANDLED_QTY = TRIM(HANDLED_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE_HIS DROP COLUMN HANDLED_QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE_HIS  RENAME COLUMN  UN_HANDLE_QTY  TO UN_HANDLE_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE_HIS  ADD UN_HANDLE_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE_HIS SET UN_HANDLE_QTY = TRIM(UN_HANDLE_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE_HIS DROP COLUMN UN_HANDLE_QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE_HIS  RENAME COLUMN  RESERVED_QTY  TO RESERVED_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE_HIS  ADD RESERVED_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE_HIS SET RESERVED_QTY = TRIM(RESERVED_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE_HIS DROP COLUMN RESERVED_QTY_TEMP;

ALTER TABLE MMS_DOCUMENT_LINE_HIS  RENAME COLUMN  UN_RESERVED_QTY  TO UN_RESERVED_QTY_TEMP;
ALTER TABLE MMS_DOCUMENT_LINE_HIS  ADD UN_RESERVED_QTY  NUMBER(38, 4);
UPDATE MMS_DOCUMENT_LINE_HIS SET UN_RESERVED_QTY = TRIM(UN_RESERVED_QTY_TEMP);
ALTER TABLE MMS_DOCUMENT_LINE_HIS DROP COLUMN UN_RESERVED_QTY_TEMP;